package com.arifrgilang.presentation.hda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arifrgilang.presentation.R
import com.arifrgilang.presentation.base.BaseBindingFragment
import com.arifrgilang.presentation.databinding.FragmentHdaBinding
import com.arifrgilang.presentation.databinding.FragmentKkmBinding

class HDAFragment : BaseBindingFragment<FragmentHdaBinding>() {
    //    private val viewModel by viewModel<HDAViewModel>()
    override fun contentView(): Int = R.layout.fragment_hda

    override fun setupData(savedInstanceState: Bundle?) {}

    override fun setupView() {}
}