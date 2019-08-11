package com.sales.pages.my_page

import android.view.View

class MyPageViewModelImpl : MyPageViewModel() {
    private var myPageView: MyPageView? = null

    override fun init(view: MyPageView) {
        this.myPageView = view
    }
}
