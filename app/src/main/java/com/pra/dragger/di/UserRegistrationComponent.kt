package com.pra.dragger.di

import com.pra.dragger.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class]
)
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory {
        fun create(
            @BindsInstance count: Int,
            @TCount @BindsInstance tcount: Int,
            appComponent: AppComponent
        ): UserRegistrationComponent
    }
}