package com.github.dk98126.efca2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
class Efca2Application

fun main(args: Array<String>) {
    runApplication<Efca2Application>(*args)
}
