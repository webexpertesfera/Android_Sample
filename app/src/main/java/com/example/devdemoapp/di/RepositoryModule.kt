package com.example.devdemoapp.di

import com.example.devdemoapp.post.domain.repository.PostDataRepository
import com.example.devdemoapp.post.domain.repository.PostRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindPostRepository(postDataRepository: PostDataRepository): PostRepository

}