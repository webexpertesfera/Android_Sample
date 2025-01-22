package com.example.devdemoapp.post.domain.repository

import com.example.devdemoapp.post.domain.model.PostResponse
import com.example.devdemoapp.post.domain.service.PostApiService
import javax.inject.Inject

class PostDataRepository @Inject constructor(
    private val postApiService: PostApiService
) : PostRepository {

    override suspend fun getPosts(): PostResponse {
        return postApiService.getPosts()
    }

}