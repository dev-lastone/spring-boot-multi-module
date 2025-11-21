package com.example.apiserveramodule.controller

import com.example.apiserveramodule.service.ApiServerAService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiServerAController(
    private val apiServiceAService: ApiServerAService
) {
    @GetMapping("/api")
    fun getData(): String {
        return apiServiceAService.getServiceData()
    }
}