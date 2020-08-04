package com.example.consumer.controller

import com.alibaba.dubbo.config.annotation.Reference
import com.example.api.entity.User
import com.example.api.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


/**
 * @program: dubbo-exam
 *
 * @description: UserController
 *
 * @author: loulvlin
 *
 * @create: 2020-08-04 15:03
 */
@RestController
class UserController {

    @Reference
    lateinit var userService: UserService

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable id: Int?): User? {
        //调用服务
        return userService.findUserById(id!!)
    }
}