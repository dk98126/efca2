package com.github.dk98126.efca2.controller

import com.github.dk98126.efca2.repo.UserRepo
import com.github.dk98126.efca2.model.User
import kotlinx.coroutines.flow.Flow
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/user")
class UserController(private val userRepo: UserRepo) {
    @GetMapping("/all")
    fun findAll(): Flow<User> = userRepo.findAll()

    @GetMapping("/count")
    suspend fun count(): Long = userRepo.count()

    @GetMapping("/{id}")
    suspend fun findOne(@PathVariable id: Long): User? = userRepo.findOne(id)

    @PostMapping
    suspend fun save(@RequestBody user: User) = userRepo.save(user)
}