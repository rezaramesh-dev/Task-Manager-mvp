package com.onestackdev.taskmanager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.onestackdev.taskmanager.mvp.model.MainActivityModel
import com.onestackdev.taskmanager.mvp.presenter.MainActivityPresenter
import com.onestackdev.taskmanager.mvp.view.MainActivityView

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = MainActivityView(this)
        enableEdgeToEdge()
        setContentView(view.binding.root)

        //Init Presenter
        presenter = MainActivityPresenter(view, MainActivityModel(this))
        presenter.onCreate()

    }
}