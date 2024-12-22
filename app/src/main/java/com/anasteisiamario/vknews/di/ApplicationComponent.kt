package com.anasteisiamario.vknews.di

import android.content.Context
import com.anasteisiamario.vknews.domain.entity.FeedPost
import com.anasteisiamario.vknews.presentation.ViewModelFactory
import com.anasteisiamario.vknews.presentation.main.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class,
    ]
)
interface ApplicationComponent {

    fun getViewModelFactory(): ViewModelFactory

    fun getCommentsScreenComponentFactory(): CommentsScreenComponent.Factory

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance context: Context,
        ): ApplicationComponent
    }
}