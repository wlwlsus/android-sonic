package com.dontsc.sonicapplication.presentation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dontsc.sonicapplication.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class InitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)


    }

    override fun onResume() {
        super.onResume()
        CoroutineScope(Default).launch {
            delay(2000)
            startActivity(Intent(this@InitActivity, LoadingActivity::class.java))
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
        }
    }
}