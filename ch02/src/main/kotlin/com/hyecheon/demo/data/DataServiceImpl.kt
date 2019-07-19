package com.hyecheon.demo.data

import com.hyecheon.demo.beans.Data
import com.hyecheon.demo.beans.User
import org.springframework.stereotype.Repository

@Repository
class DataServiceImpl : DataService {
    override fun retrieveData(user: User): List<Data> {
        return listOf(Data(10), Data(20))
    }
}