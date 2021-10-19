package com.dontsc.sonicapplication.presentation.view


import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.dontsc.sonicapplication.R
import com.dontsc.sonicapplication.databinding.ActivityLoadingBinding
import com.dontsc.sonicapplication.presentation.view.base.UtilityBase
import android.widget.TextView





class LoadingActivity :
    UtilityBase.BaseAppCompatActivity<ActivityLoadingBinding>(R.layout.activity_loading) {

    override fun ActivityLoadingBinding.onCreate() {
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//        val appBarConfiguration = AppBarConfiguration(navController.graph)
//
//        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
        setSupportActionBar(binding.toolbar)

        binding.apply {
            toolbarAddress.setOnClickListener {
                Toast.makeText(this@LoadingActivity, "Go to Address Page", Toast.LENGTH_SHORT)
                    .show()
            }

            toolbarGithub.setOnClickListener {
                Toast.makeText(this@LoadingActivity, "Go to Github Page", Toast.LENGTH_SHORT).show()
            }

            toolbarSearch.setOnClickListener {
                Toast.makeText(this@LoadingActivity, "Go to Search Page", Toast.LENGTH_SHORT).show()
            }

            toolbarMenu.setOnClickListener {
                Toast.makeText(this@LoadingActivity, "Go to Menu Page", Toast.LENGTH_SHORT).show()
            }

            toolbarAlim.setOnClickListener {
                Toast.makeText(this@LoadingActivity, "Go to Alim Page", Toast.LENGTH_SHORT).show()
            }
        }

        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNav.setupWithNavController(navController)

    }


    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
        finishAndRemoveTask()
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}