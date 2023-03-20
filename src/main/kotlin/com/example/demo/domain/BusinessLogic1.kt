package com.example.demo.domain

import com.example.demo.someservices.Service2
import mu.KotlinLogging.logger
import org.springframework.stereotype.Component

@Component
class BusinessLogic1(private val service2: Service2) {

    val log = logger { }

    fun doSomeBusiness(): Int{
        log.info { "I call service 2" }
        return service2.useService();

    }
}