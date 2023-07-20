package com.pra.dragger.di

import com.pra.dragger.repository.FireBaseRepository
import com.pra.dragger.repository.SqlRepository
import com.pra.dragger.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryServiceModule {

    @SqlQualifier
    @Provides
    fun getSqlRepositoryRepository(sqlRepository: SqlRepository): UserRepository {
        return sqlRepository
    }


    @FireBaseQualifier
    @Provides
    fun getFireBaseRepositoryRepository(): UserRepository {
        return FireBaseRepository()
    }
}