package com.hyecheon.demo.business

import com.hyecheon.demo.beans.User

interface BusinessService {
    fun calculateSum(user: User): Long
}