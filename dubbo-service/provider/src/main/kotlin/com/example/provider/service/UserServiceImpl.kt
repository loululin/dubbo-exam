package com.example.provider.service

import com.alibaba.dubbo.config.annotation.Service
import com.example.api.entity.User
import com.example.api.service.UserService

/**
 * @program: dubbo-exam
 *
 * @description: UserServiceImpl
 *
 * @author: loulvlin
 *
 * @create: 2020-08-04 14:35
 */
@Service
class UserServiceImpl: UserService {
    override fun findUserById(id: Int): User? {
        return User().apply {
            age = id
            name = "hello"
        }
    }
}