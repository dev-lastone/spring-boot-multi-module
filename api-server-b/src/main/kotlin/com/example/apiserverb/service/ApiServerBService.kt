package com.example.apiserverb.service

import com.example.domain.DomainService
import org.springframework.stereotype.Service

@Service
class ApiServerBService(
    private val domainService: DomainService
) {
    fun getServiceData(): String {
        return domainService.getDomainData()
    }
}