package com.pra.dragger.di

import com.pra.dragger.repository.FireBaseRepository
import com.pra.dragger.repository.SqlRepository
import com.pra.dragger.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryServiceModule {

    @Binds
    abstract fun getSqlRepositoryRepository(sqlRepository: SqlRepository): UserRepository

}