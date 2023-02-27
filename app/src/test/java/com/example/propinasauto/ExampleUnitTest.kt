package com.example.propinasauto

import org.junit.Test


import org.junit.Assert.*
import java.text.NumberFormat

class ExampleUnitTest {
    @Test
    fun calculate_20_percent_tip_no_roundup()
    {
        val cantidad = 10.00
        val tin = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = cantidad, tipPercent = tin, false)
        assertEquals(expectedTip, actualTip)
    }
}