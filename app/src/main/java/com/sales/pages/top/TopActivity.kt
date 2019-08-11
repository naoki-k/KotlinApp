package com.sales.pages.top

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager

import com.sales.R
import com.sales.databinding.ActivityTopBinding
import com.sales.pages.home.HomeFragment
import com.sales.util.FragmentUtil
import kotlinx.android.synthetic.main.activity_top.*

class TopActivity : AppCompatActivity(), ViewPager.OnPageChangeListener, TopView {
    private var viewModel: TopViewModel? = null
    private var binding: ActivityTopBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityTopBinding>(this, R.layout.activity_top)
        viewModel = TopViewModelImpl()
        viewModel?.init(this)
        binding?.viewModel = viewModel
//
//        val fragmentUtil = FragmentUtil(supportFragmentManager, R.id.top_container)
//        fragmentUtil.openFragment(HomeFragment.createInstance())

        pager.addOnPageChangeListener(this)
        setTabLayout()
    }

    override fun onPageScrollStateChanged(position: Int) {
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
    }

    private fun setTabLayout() {
        val adapter = TopTabAdapter(supportFragmentManager, this)
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
        for (i in 0 until adapter.count) {
            val tab: TabLayout.Tab = tabs.getTabAt(i)!!
            tab.customView = adapter.getTabView(tabs, i)
        }
    }
}
