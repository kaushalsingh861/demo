package com.example.demo

import org.junit.jupiter.api.TestInstance
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(classes = [DemoApplication::class])
@ActiveProfiles("test", "heavyResource")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Suppress("UnnecessaryAbstractClass")
abstract class SpringIntegrationTest