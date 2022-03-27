package com.shashank.notetest.di

import androidx.lifecycle.ViewModelProvider
import com.shashank.notetest.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(providerFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}