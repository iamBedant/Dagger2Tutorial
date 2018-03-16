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

    /**
     * You do this If you don't have access to the constructor of AComplexCustomObject class. Because in
     * that case you wont be able to add @Inject to the constructor.
     */
    @Provides
    fun provideComplexCustomObject(customObject: ACustomObject): AComplexCustomObject{
        return AComplexCustomObject(customObject)
    }
}