package com.example.demo.domain

import com.example.demo.SpringIntegrationTest
import com.example.demo.someservices.Service3
import com.ninjasquad.springmockk.MockkBean
import mu.KotlinLogging.logger
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class BusinessLogic2Test: SpringIntegrationTest() {

    @Autowired
    lateinit var businessLogic2: BusinessLogic2

    val log = logger { }

    @MockkBean(relaxed = true)
    lateinit var service3: Service3

    @Test
    fun `service 1 should be called`(){
        val res = businessLogic2.againDoSomeBusiness()

        Assertions.assertThat(res).isEqualTo(1)
    }
}