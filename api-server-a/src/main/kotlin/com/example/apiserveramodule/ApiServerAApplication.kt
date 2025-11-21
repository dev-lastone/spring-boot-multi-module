package com.example.apiserveramodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example"])
class ApiServerAApplication

fun main(args: Array<String>) {
	runApplication<ApiServerAApplication>(*args)
}
