package com.example.demo.someservices

import mu.KotlinLogging
import mu.KotlinLogging.logger
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class Service2(private val service1: Service1) {

    val log = logger { }

    fun useService(): Int{

        log.info { "I call service 1" }

        service1.printSomething()
        return 1;
    }

}