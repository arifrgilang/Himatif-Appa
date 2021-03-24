package com.arifrgilang.presentation.keilmuan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arifrgilang.presentation.R
import com.arifrgilang.presentation.base.BaseBindingFragment
import com.arifrgilang.presentation.databinding.FragmentKeilmuanBinding
import com.arifrgilang.presentation.databinding.FragmentKkmBinding

class KeilmuanFragment : BaseBindingFragment<FragmentKeilmuanBinding>() {
    //    private val viewModel by viewModel<KeilmuanViewModel>()
    override fun contentView(): Int = R.layout.fragment_keilmuan

    override fun setupData(savedInstanceState: Bundle?) {}

    override fun setupView() {}
}