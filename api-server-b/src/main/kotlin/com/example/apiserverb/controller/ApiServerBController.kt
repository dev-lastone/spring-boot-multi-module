package com.example.apiserverb.controller

import com.example.apiserverb.service.ApiServerBService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiServerBController(
    private val apiServiceAService: ApiServerBService
) {
    @GetMapping("/api")
    fun getData(): String {
        return apiServiceAService.getServiceData()
    }
}