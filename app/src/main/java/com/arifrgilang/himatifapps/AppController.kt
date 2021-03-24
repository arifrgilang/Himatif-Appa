package com.arifrgilang.himatifapps

import android.app.Application
import com.arifrgilang.data.di.dataModule
import com.arifrgilang.domain.di.domainModule
import com.arifrgilang.himatifapps.di.remoteModule
import com.arifrgilang.presentation.di.presentationModule
import com.orhanobut.hawk.Hawk
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppController: Application(){
    override fun onCreate() {
        super.onCreate()
        Hawk.init(this).build()

        startKoin {
//            androidLogger()
            androidContext(this@AppController)
            modules(
//                remoteModule,
//                dataModule,
//                domainModule,
                presentationModule
            )
        }
    }
}