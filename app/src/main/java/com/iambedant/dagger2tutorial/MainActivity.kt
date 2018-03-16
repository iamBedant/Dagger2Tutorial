package com.iambedant.dagger2tutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var customObject: ACustomObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerApplicationComponent.builder().build().inject(this)
        if (customObject != null)
            Timber.d("Object Injected succesfully")
    }
}
