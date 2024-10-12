package com.aldairgc.avengers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class AvengersApiApplication

fun main(args: Array<String>) {
	runApplication<AvengersApiApplication>(*args)
}
