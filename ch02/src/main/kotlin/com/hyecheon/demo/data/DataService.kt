package com.hyecheon.demo.data

import com.hyecheon.demo.beans.Data
import com.hyecheon.demo.beans.User

interface DataService {
    fun retrieveData(user: User): List<Data>
}