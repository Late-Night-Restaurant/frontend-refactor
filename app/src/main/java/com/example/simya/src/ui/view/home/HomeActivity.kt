package com.example.simya.src.ui.view.home

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.simya.R
import com.example.simya.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home)
{
    override fun init() {
        val bottomNavigationView = binding.bnvHomeNavi
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_home) as NavHostFragment
        val navController = navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)
    }
}
