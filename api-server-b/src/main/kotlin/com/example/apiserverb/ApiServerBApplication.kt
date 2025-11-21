package com.example.apiserverb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example"])
class ApiServerBApplication

fun main(args: Array<String>) {
	runApplication<ApiServerBApplication>(*args)
}
