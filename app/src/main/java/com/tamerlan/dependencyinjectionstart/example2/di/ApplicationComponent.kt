package com.tamerlan.dependencyinjectionstart.example2.di

import android.content.Context
import com.tamerlan.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }

}