package com.ivy.domain.di

import com.ivy.domain.features.Features
import com.ivy.domain.features.IvyFeatures
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface IvyCoreBindingsModule {
    @Binds
    fun bindFeatures(features: IvyFeatures): Features
}
