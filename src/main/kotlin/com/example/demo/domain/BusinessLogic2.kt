package com.example.demo.domain

import com.example.demo.someservices.Service4
import mu.KotlinLogging
import mu.KotlinLogging.logger
import org.springframework.stereotype.Component

@Component
class BusinessLogic2(private val service4: Service4) {

    val log = logger { }

    fun againDoSomeBusiness(): Int{
        log.info { "I call service 4" }
        return service4.useServiceAgain();
    }
}