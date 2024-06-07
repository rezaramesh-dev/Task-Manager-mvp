package com.onestackdev.taskmanager.mvp.presenter

import com.onestackdev.taskmanager.mvp.extension.BaseLifecycle
import com.onestackdev.taskmanager.mvp.model.MainActivityModel
import com.onestackdev.taskmanager.mvp.view.MainActivityView

class MainActivityPresenter(
    private val view: MainActivityView, private val model: MainActivityModel
) : BaseLifecycle {

    override fun onCreate() {

    }

}