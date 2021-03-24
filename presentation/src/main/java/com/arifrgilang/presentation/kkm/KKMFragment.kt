package com.arifrgilang.presentation.kkm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arifrgilang.presentation.R
import com.arifrgilang.presentation.base.BaseBindingFragment
import com.arifrgilang.presentation.databinding.FragmentKkmBinding
import com.arifrgilang.presentation.databinding.FragmentLoginBinding

class KKMFragment : BaseBindingFragment<FragmentKkmBinding>() {
    //    private val viewModel by viewModel<KKMViewModel>()
    override fun contentView(): Int = R.layout.fragment_kkm

    override fun setupData(savedInstanceState: Bundle?) {}

    override fun setupView() {}
}