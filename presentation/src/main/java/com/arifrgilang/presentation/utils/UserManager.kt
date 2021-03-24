package com.arifrgilang.presentation.utils

import com.arifrgilang.presentation.utils.Constants.IS_USER_LOGGED_IN
import com.arifrgilang.presentation.utils.Constants.USER_NPM
import com.orhanobut.hawk.Hawk

class UserManager {
    fun startUserSession(npm: String) {
        Hawk.put(IS_USER_LOGGED_IN, true)
        Hawk.put(USER_NPM, npm)
    }

    fun isSessionActive(): Boolean {
        return Hawk.get(IS_USER_LOGGED_IN)
    }

    fun endUserSession() {
        Hawk.put(IS_USER_LOGGED_IN, false)
        Hawk.delete(USER_NPM)
    }
}