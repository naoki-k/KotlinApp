package com.sales.pages.top

import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.sales.R
import com.sales.pages.home.HomeFragment
import com.sales.pages.my_page.MyPageFragment

class TopTabAdapter(fragmentManager: FragmentManager, private val context: Context) : FragmentStatePagerAdapter(fragmentManager) {
    private val pageTitle = arrayOf("HOME", "MYPAGE")
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 ->  HomeFragment.createInstance()
            1 ->  MyPageFragment.createInstance()
            else ->  HomeFragment.createInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageTitle[position]
    }

    override fun getCount(): Int {
        return pageTitle.size
    }

    fun getTabView(tabLayout: TabLayout, position: Int): View {
        val view = LayoutInflater.from(this.context).inflate(R.layout.tab_item, tabLayout, false)
        val tab = view.findViewById<TextView>(R.id.teb_item_text)
        tab.text = pageTitle[position]
        val image = view.findViewById<ImageView>(R.id.teb_item_image)
        image.setImageResource(R.mipmap.ic_launcher)
        return view
    }
}