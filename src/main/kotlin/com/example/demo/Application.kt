package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
    // Same thing:
    // SpringApplication.run(Application::class.java, *args)
    println("Hello world!")
}
