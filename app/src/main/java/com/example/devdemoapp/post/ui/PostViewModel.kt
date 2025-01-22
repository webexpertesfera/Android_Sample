package com.example.devdemoapp.post.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.devdemoapp.base.BaseViewModel
import com.example.devdemoapp.common.BaseApiStatus
import com.example.devdemoapp.common.NetworkResult
import com.example.devdemoapp.post.domain.model.PostResponse
import com.example.devdemoapp.post.domain.service.PostApiService
import com.example.devdemoapp.post.domain.usecase.PostUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    private val useCase: PostUseCase,
    private val postApiService: PostApiService
) : BaseViewModel() {

    private val _postStatus: MutableLiveData<BaseApiStatus<PostResponse>> = MutableLiveData()
    val postStatus: LiveData<BaseApiStatus<PostResponse>> get() = _postStatus

    fun getPostList(){
        viewModelScope.launch {
            safeApiCall { postApiService.getPostList() }.collect {
                when (it) {
                    is NetworkResult.Loading -> _postStatus.postValue(BaseApiStatus(isLoading = true))
                    is NetworkResult.Success -> _postStatus.postValue(BaseApiStatus(data = it.data))
                    is NetworkResult.Error -> _postStatus.postValue(BaseApiStatus(errorMessage = it.message))
                }
            }
        }
    }

}