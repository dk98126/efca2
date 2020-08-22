package com.github.dk98126.efca2.repo

import com.github.dk98126.efca2.model.User
import kotlinx.coroutines.flow.Flow
import org.springframework.data.r2dbc.core.*
import org.springframework.stereotype.Repository

@Repository
class UserRepo(private val client: DatabaseClient) {
    suspend fun count(): Long = client.execute("SELECT count(*) FROM users").asType<Long>().fetch().awaitOne()

    fun findAll(): Flow<User> = client.select().from("users").asType<User>().fetch().flow()

    suspend fun findOne(id: Long): User? =
            client.execute("SELECT * FROM users WHERE id = :id")
                    .bind("id", id)
                    .asType<User>()
                    .fetch()
                    .awaitOneOrNull()

    suspend fun save(user: User) = client.insert().into(user.javaClass).table("users").using(user).await()
}