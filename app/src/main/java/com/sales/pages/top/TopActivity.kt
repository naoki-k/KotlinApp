package com.sales.pages.top

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View

import com.sales.R
import com.sales.databinding.ActivityTopBinding
import com.sales.util.FragmentUtil

class TopActivity : AppCompatActivity(), TopView {
    private var viewModel: TopViewModel? = null
    private var binding: ActivityTopBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityTopBinding>(this, R.layout.activity_top)
        viewModel = TopViewModelImpl()
        viewModel?.init(this)
        binding?.viewModel = viewModel

        val fragmentUtil = FragmentUtil(supportFragmentManager, R.id.top_container)
        fragmentUtil.openFragment(HomeFragment.createInstance())
    }
}
