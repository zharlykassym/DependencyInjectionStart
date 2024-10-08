package com.tamerlan.dependencyinjectionstart.example2.di

import com.tamerlan.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.tamerlan.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository
}