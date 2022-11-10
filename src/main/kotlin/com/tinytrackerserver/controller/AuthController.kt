package com.tinytrackerserver.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController {

    @GetMapping("/user")
    fun getUser(): String {
        System.out.println("version req")

        return "10.10"
    }
}