package com.iambedant.dagger2tutorial

import dagger.Component
import javax.inject.Singleton

/**
 * Created by kuliza-233 on 15/03/18.
 */
@Singleton
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}