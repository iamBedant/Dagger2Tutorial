package com.iambedant.dagger2tutorial

import android.app.Application
import timber.log.Timber

/**
 * Created by kuliza-233 on 15/03/18.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}