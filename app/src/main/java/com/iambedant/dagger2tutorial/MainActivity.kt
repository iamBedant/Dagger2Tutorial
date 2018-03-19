package com.iambedant.dagger2tutorial

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var customObject: ACustomObject

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var complexCustomObject: AComplexCustomObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(application)).build().inject(this)
        if (customObject != null)
            Timber.d("Custom Object Injected succesfully")

        if (complexCustomObject != null)
            Timber.d("Complex Custom Object Injected succesfully")

        if(context!=null)
            Timber.d("Context Injected succesfully")

    }
}
