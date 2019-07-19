package com.hyecheon.demo.business

import com.hyecheon.demo.beans.User
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class BusinessServiceImplTest {
    val DUMMY_USER: User = User("dummy")
    @Autowired
    private lateinit var businessServiceImpl: BusinessServiceImpl

    @Test
    fun testCalculateSum() {
        val sum = businessServiceImpl.calculateSum(DUMMY_USER)
        assertEquals(30, sum)
    }
}
