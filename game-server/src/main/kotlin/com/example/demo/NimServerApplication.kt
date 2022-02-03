package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Startup our Application.
 */
@SpringBootApplication
open class NimServer

fun main(args: Array<String>) {
    runApplication<NimServer>(*args)
}
