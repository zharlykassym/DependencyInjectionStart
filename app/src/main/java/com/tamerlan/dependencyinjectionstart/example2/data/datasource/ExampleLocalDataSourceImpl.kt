package com.tamerlan.dependencyinjectionstart.example2.data.datasource

import com.tamerlan.dependencyinjectionstart.example2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}