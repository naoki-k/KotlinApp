package com.sales.pages.top

import android.view.View

class TopViewModelImpl : TopViewModel() {
    private var topView: TopView? = null

    override fun init(view: TopView) {
        this.topView = view
    }
}
