package com.onestackdev.taskmanager.mvp.extension

interface BaseLifecycle {

    fun onCreate()

    fun onStop() {}

    fun onDestroy() {}
}