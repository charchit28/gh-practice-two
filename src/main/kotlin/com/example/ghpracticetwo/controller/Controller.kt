package com.example.ghpracticetwo.controller

import com.example.ghpracticetwo.service.PublicService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(var publicService: PublicService) {



    @PostMapping("/add")

    fun add() {

    }
}