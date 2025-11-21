package com.example.apiservera.controller

import com.example.apiservera.service.ApiServerAService
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