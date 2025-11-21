package com.example.apiserveramodule.service

import com.example.domain.DomainService
import org.springframework.stereotype.Service

@Service
class ApiServerAService(
    private val domainService: DomainService
) {
    fun getServiceData(): String {
        return domainService.getDomainData()
    }
}