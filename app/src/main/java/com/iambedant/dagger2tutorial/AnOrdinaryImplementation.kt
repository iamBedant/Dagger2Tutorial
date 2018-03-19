package com.iambedant.dagger2tutorial

import android.util.Log
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by kuliza-233 on 19/03/18.
 */
class AnOrdinaryImplementation @Inject constructor() : AnOrdinaryInterface {
    private val count = 5
    override fun printMe(){
        Timber.d(count.toString())
    }
}