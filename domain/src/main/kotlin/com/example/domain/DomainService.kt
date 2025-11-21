package com.example.domain

import org.springframework.stereotype.Service

@Service
class DomainService {
    fun getDomainData(serviceName: String): String {
        return "Domain Data = $serviceName"
    }
}