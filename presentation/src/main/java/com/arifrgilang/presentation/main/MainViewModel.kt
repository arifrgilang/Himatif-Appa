package com.arifrgilang.presentation.main

import com.arifrgilang.presentation.base.BaseViewModel
import com.arifrgilang.presentation.utils.UserManager

class MainViewModel(
    private val userManager: UserManager
) : BaseViewModel() {
    fun onUserSignOut() {
        userManager.endUserSession()
        postSuccessSnackbar("Success logout")
    }
}