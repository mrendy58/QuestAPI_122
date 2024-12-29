package com.example.p8meeting12

import android.app.Application
import com.example.p8meeting12.repository.AppContainer
import com.example.p8meeting12.repository.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}