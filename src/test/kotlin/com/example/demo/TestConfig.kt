package com.example.demo

import jakarta.annotation.PostConstruct
import mu.KotlinLogging.logger
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile



@Configuration
@Profile("heavyResource")
class TestConfig {


    val log = logger { }

    @Value("\${someProp.other}")
    lateinit var prop:String

    /**
     * This method is expected to call only once for same profile config of test,
     * bue if the mock beans are used, it will be called for every new test class
     *
     * if the mock bean creation is commented in BusinessLogic1Test.kt and
     * BusinessLogic2Test.kt, the context is only created once for both classes
     */
    @PostConstruct
    fun createSomeHeavyDomainResources(){
        log.info { "create heavy resources only once for test with prop $prop" }
    }

}