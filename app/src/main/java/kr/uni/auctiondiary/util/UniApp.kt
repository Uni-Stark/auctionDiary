package kr.uni.auctiondiary.util

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UniApp : Application() {

    companion object {

        @get:Synchronized
        var instance: UniApp? = null
            private set

    }

    override fun onCreate() {
        super.onCreate()
    }
}