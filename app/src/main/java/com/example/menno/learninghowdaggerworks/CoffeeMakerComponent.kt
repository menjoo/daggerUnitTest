package com.example.menno.learninghowdaggerworks

import dagger.Component

@Component(modules = [CoffeeMakerModule::class])
interface CoffeeMakerComponent {

    fun inject(coffeeMaker: CoffeeMaker)
}
