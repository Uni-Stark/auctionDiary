package kr.uni.auctiondiary.ui

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UniApp :Application() {
    override fun onCreate() {
        super.onCreate()
    }
}