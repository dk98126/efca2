package com.github.dk98126.efca2.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("users")
data class User(
        @Id
        var id: Long?,
        var name: String,
        var age: Int
)