package com.arifrgilang.presentation.di

import com.arifrgilang.presentation.main.MainViewModel
import com.arifrgilang.presentation.utils.UserManager
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        MainViewModel(get())
    }

    single {
        UserManager()
    }
}