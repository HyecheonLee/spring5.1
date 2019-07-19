package com.hyecheon.demo.business

import com.hyecheon.demo.beans.User
import com.hyecheon.demo.data.DataService
import org.springframework.stereotype.Service

@Service
class BusinessServiceImpl(private val dataService: DataService) : BusinessService {
    override fun calculateSum(user: User): Long {
        return dataService.retrieveData(user).map { data -> data.value.toLong() }.sum()
    }
}