package com.example.devdemoapp.post.domain.repository

import com.example.devdemoapp.post.domain.model.PostResponse

interface PostRepository {

    suspend fun getPosts(): PostResponse

}