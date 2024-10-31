package com.tamerlan.dependencyinjectionstart.example2.di

import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}