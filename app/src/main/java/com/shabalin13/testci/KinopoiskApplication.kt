package com.shabalin13.testci

import android.app.Application
import com.shabalin13.testci.data.di.DaggerDataComponent
import com.shabalin13.testci.di.AppComponent
import com.shabalin13.testci.di.DaggerAppComponent
import com.shabalin13.testci.di.FeatureDependencies

class KinopoiskApplication :
    Application() {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
            dataComponent = DaggerDataComponent.factory().create()
        )
    }

    fun getFeatureDependencies(): FeatureDependencies = appComponent
}
