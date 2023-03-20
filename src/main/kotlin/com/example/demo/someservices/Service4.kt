package com.example.demo.someservices

import mu.KotlinLogging
import mu.KotlinLogging.logger
import org.springframework.stereotype.Service

@Service
class Service4(private val service3: Service3) {

    val log = logger { }

    fun useServiceAgain(): Int{

        log.info { "I call service 3" }

        service3.printAnotherThing()
        return 1;
    }
}