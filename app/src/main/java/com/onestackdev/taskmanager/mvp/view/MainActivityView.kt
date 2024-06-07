package com.onestackdev.taskmanager.mvp.view

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.onestackdev.taskmanager.databinding.ActivityMainBinding

class MainActivityView(contextInstance: Context) : FrameLayout(contextInstance) {

    val binding = ActivityMainBinding.inflate(LayoutInflater.from(context))

}