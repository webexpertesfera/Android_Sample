package com.example.devdemoapp.post.domain.usecase

import com.example.devdemoapp.common.NetworkResult
import com.example.devdemoapp.post.domain.model.PostResponse
import com.example.devdemoapp.post.domain.repository.PostRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class PostUseCase @Inject constructor(
    private val postRepository: PostRepository
) {

    suspend fun getPosts() = flow<NetworkResult<PostResponse>> {
        try {
            emit(NetworkResult.Loading<PostResponse>())
            val result = postRepository.getPosts()
            emit(NetworkResult.Success<PostResponse>(result))
        } catch (e: HttpException) {
            emit(NetworkResult.Error<PostResponse>(errorMessage = e.localizedMessage))
        } catch (e: IOException) {
            emit(NetworkResult.Error<PostResponse>(errorMessage = e.localizedMessage))
        }
    }

}