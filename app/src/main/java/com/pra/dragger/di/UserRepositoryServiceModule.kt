package com.pra.dragger.di

import com.pra.dragger.repository.FireBaseRepository
import com.pra.dragger.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryServiceModule {

    @Provides
    fun getFireBaseRepository(): UserRepository {
        return FireBaseRepository()
    }

}