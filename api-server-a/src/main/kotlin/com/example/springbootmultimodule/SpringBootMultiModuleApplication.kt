package com.example.springbootmultimodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootMultiModuleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootMultiModuleApplication>(*args)
}
