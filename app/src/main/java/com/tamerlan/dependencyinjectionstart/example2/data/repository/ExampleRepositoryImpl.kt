package com.tamerlan.dependencyinjectionstart.example2.data.repository

import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.tamerlan.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.tamerlan.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import com.tamerlan.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}