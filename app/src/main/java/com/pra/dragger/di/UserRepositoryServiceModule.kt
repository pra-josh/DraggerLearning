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

    @ActivityScope
    @SqlQualifier
    @Provides
    fun getSqlRepositoryRepository(sqlRepository: SqlRepository): UserRepository {
        return sqlRepository
    }


    @ActivityScope
    @FireBaseQualifier
    @Provides
    fun getFireBaseRepositoryRepository(analyticsService: AnalyticsService): UserRepository {
        return FireBaseRepository(analyticsService)
    }
}