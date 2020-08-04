package com.example.api.service

import com.example.api.entity.User

/**
 * @program: dubbo-exam
 *
 * @description: UserService
 *
 * @author: loulvlin
 *
 * @create: 2020-08-04 14:09
 */
interface UserService {
    fun findUserById(id: Int): User?
}