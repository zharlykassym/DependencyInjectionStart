package com.tamerlan.dependencyinjectionstart.example2.di

import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}