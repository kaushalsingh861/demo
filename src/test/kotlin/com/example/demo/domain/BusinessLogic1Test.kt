package com.example.demo.domain

import com.example.demo.SpringIntegrationTest
import com.example.demo.someservices.Service1
import com.ninjasquad.springmockk.MockkBean
import mu.KotlinLogging.logger
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class BusinessLogic1Test: SpringIntegrationTest() {

    @Autowired
    lateinit var businessLogic1: BusinessLogic1

    val log = logger { }


    @MockkBean(relaxed = true)
    lateinit var service1: Service1

    @Test
    fun `service 1 should be called`(){
        val res = businessLogic1.doSomeBusiness()
        Assertions.assertThat(res).isEqualTo(1)
    }

}