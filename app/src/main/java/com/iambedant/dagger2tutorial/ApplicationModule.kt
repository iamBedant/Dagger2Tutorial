package com.iambedant.dagger2tutorial

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by kuliza-233 on 15/03/18.
 */
@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindApplication(application: Application): Context

    @Binds
    abstract fun bindAnOrdinaryThing(ordinaryImplementation: AnOrdinaryImplementation): AnOrdinaryInterface

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideCustomObject(): ACustomObject = ACustomObject()

        @JvmStatic
        @Provides
        fun provideComplexCustomObject(customObject: ACustomObject): AComplexCustomObject = AComplexCustomObject(customObject)

    }


}