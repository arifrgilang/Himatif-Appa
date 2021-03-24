package com.arifrgilang.presentation.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    private val successSnackbar = MutableLiveData<String>()
    fun successSnackbar() = successSnackbar as LiveData<String>

    protected fun postSuccessSnackbar(message: String) {
        successSnackbar.postValue(message)
    }
}