package com.example.menno.learninghowdaggerworks

import javax.inject.Inject

class CoffeeMaker @Inject constructor() {
    @Inject lateinit var compressor: Compressor
}
