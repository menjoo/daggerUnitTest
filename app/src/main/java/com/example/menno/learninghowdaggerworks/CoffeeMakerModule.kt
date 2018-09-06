package com.example.menno.learninghowdaggerworks

import dagger.Module
import dagger.Provides

@Module
open class CoffeeMakerModule {

    @Provides
    open fun provideCompressor() = Compressor("psssstttt!")
}
