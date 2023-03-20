package com.example.demo.someservices

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class Service1 {
    fun printSomething(): Unit {
        print("I only print something real")
    }
}