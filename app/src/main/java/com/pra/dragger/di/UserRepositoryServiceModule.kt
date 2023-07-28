package com.pra.dragger.di

import com.pra.dragger.repository.AnalyticsService
import com.pra.dragger.repository.FireBaseRepository
import com.pra.dragger.repository.SqlRepository
import com.pra.dragger.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryServiceModule {

    @SqlQualifier
    @Provides
    fun getSqlRepositoryRepository(sqlRepository: SqlRepository): UserRepository {
        return sqlRepository
    }


    @FireBaseQualifier
    @Provides
    fun getFireBaseRepositoryRepository(@Named("mixPanel") analyticsService: AnalyticsService): UserRepository {
        return FireBaseRepository(analyticsService)
    }
}