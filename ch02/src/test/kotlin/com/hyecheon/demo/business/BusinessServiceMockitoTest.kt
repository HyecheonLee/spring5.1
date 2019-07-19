package com.hyecheon.demo.business

import com.hyecheon.demo.beans.Data
import com.hyecheon.demo.beans.User
import com.hyecheon.demo.data.DataService
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class BusinessServiceMockitoTest {
    private val DUMMY_USER = User("dummy")
    @Mock
    private lateinit var dataServiceMock: DataService

    @InjectMocks
    private lateinit var service: BusinessServiceImpl

    @Before
    fun setUp() {
        service = BusinessServiceImpl(dataServiceMock)
    }

    @Test
    fun testCalculateSum() {
        BDDMockito.given(dataServiceMock.retrieveData(User("dummy")))
                .willReturn(listOf(Data(10), Data(15), Data(25)))
        val sum = service.calculateSum(DUMMY_USER)
        assertEquals(10 + 15 + 25, sum)
    }
}