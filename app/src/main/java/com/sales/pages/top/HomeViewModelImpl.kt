package com.sales.pages.top

import android.view.View

class HomeViewModelImpl : HomeViewModel() {
    private var homeView: HomeView? = null

    override fun init(view: HomeView) {
        this.homeView = view
    }

    override fun onClick(view: View) {
        view.scaleX += 1f
        view.scaleY += 1f
    }
}
