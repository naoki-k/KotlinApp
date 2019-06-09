package com.sales.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

class FragmentUtil(private val fragmentManager: FragmentManager, private val containerViewId: Int) {

    fun openFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(containerViewId, fragment).addToBackStack(null).commit()
    }
}
