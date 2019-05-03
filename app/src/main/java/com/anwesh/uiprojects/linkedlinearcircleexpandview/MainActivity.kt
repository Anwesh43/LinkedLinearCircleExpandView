package com.anwesh.uiprojects.linkedlinearcircleexpandview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linearcircleexpandview.LinearCircleExpandView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LinearCircleExpandView.create(this)
    }
}
