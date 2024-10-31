package com.tamerlan.dependencyinjectionstart.example2

import android.app.Application
import com.tamerlan.dependencyinjectionstart.example2.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }

}