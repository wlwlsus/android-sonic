package com.dontsc.sonicapplication.presentation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dontsc.sonicapplication.R
import com.dontsc.sonicapplication.databinding.ActivityInitBinding
import com.dontsc.sonicapplication.databinding.ActivityLoadingBinding
import com.dontsc.sonicapplication.presentation.view.base.UtilityBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class InitActivity :
    UtilityBase.BaseAppCompatActivity<ActivityInitBinding>(R.layout.activity_init) {
    override fun ActivityInitBinding.onCreate() = Unit

    override fun onResume() {
        super.onResume()
        CoroutineScope(Default).launch {
            delay(2000)
            startActivity(Intent(this@InitActivity, LoadingActivity::class.java))
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
        }
    }
}