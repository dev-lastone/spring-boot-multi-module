package com.example.apiserveramodule.controller

import com.example.domain.DomainService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiServerAController(
    private val domainService: DomainService
) {
    @GetMapping("/api")
    fun getData(): String {
        return domainService.getDomainData()
    }
}