package com.hlq.androidanimationpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hlq.androidanimationpro.pro.AnimationListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun visualAnimationClick(view: View) {
        startActivity(Intent(this, AnimationListActivity::class.java))
    }

}