package com.github.dk98126.efca2.repo

import com.github.dk98126.efca2.model.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface UserRepo: ReactiveCrudRepository<User, Long>
