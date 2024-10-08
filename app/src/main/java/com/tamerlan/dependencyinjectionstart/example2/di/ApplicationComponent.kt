package com.tamerlan.dependencyinjectionstart.example2.di

import com.tamerlan.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}