package com.example.menno.learninghowdaggerworks

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.menno.learninghowdaggerworks", appContext.packageName)
    }

    @Test
    fun testAndroidTestInjection() {
        val coffeeMaker = CoffeeMaker()

        DaggerCoffeeMakerComponent.builder()
                .coffeeMakerModule(AndroidTestCoffeeMakerModule())
                .build()
                .inject(coffeeMaker)

        assertEquals("psssstttt from AndroidTest module!", coffeeMaker.compressor.logMessage)
    }
}
