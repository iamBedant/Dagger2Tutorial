package com.iambedant.dagger2tutorial

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by kuliza-233 on 15/03/18.
 */
@Module
class ApplicationModule {

    @Provides
    fun provideCustomObject(): ACustomObject {
        return ACustomObject()
    }
}