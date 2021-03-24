package com.arifrgilang.presentation.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.arifrgilang.presentation.R
import com.arifrgilang.presentation.base.BaseBindingActivity
import com.arifrgilang.presentation.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    private lateinit var navHostFragment: NavHostFragment
    private val viewModel by viewModel<MainViewModel>()
    private var isHideMenu = false

    override fun contentView(): Int = R.layout.activity_main

    override fun setupData(savedInstanceState: Bundle?) {
        setupObserver()
    }

    private fun setupObserver() {

    }

    override fun setupView() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(
            binding.bottomNavigationBar,
            navHostFragment.navController
        )
        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.hdaFragment,
                R.id.keilmuanFragment,
                R.id.kkmFragment,
                R.id.loginFragment
            )
        )

        setupActionBarWithNavController(navHostFragment.navController, appBarConfiguration)
    }
}