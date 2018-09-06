package com.example.menno.learninghowdaggerworks

import org.junit.Test

import org.junit.Assert.*

class InjectTest {
    @Test
    fun testInjection() {
        val coffeeMaker = CoffeeMaker()

        DaggerCoffeeMakerComponent.create().inject(coffeeMaker)

        assertEquals("psssstttt!", coffeeMaker.compressor.logMessage)
    }

    @Test
    fun testTestInjection() {
        val coffeeMaker = CoffeeMaker()

        DaggerCoffeeMakerComponent.builder()
                .coffeeMakerModule(TestCoffeeMakerModule())
                .build()
                .inject(coffeeMaker)

        assertEquals("psssstttt from test module!", coffeeMaker.compressor.logMessage)
    }
}
