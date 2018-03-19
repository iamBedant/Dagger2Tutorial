package com.iambedant.dagger2tutorial

import dagger.Component

/**
 * Created by kuliza-233 on 15/03/18.
 */

@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}