package com.example.menno.learninghowdaggerworks

class AndroidTestCoffeeMakerModule: CoffeeMakerModule() {

    override fun provideCompressor() = Compressor("psssstttt from AndroidTest module!")
}
