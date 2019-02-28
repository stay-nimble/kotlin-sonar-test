package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/test")
    fun demo(): TestResponse {
        return TestResponse("test")
    }
}

data class TestResponse(val message: String)


