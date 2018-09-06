package com.example.menno.learninghowdaggerworks

class TestCoffeeMakerModule: CoffeeMakerModule() {

    override fun provideCompressor() = Compressor("psssstttt from test module!")
}
