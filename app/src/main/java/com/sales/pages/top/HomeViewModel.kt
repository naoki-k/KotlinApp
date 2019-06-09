package com.sales.pages.top

import android.databinding.BaseObservable
import android.view.View
import com.sales.pages.ViewModel

abstract class HomeViewModel : BaseObservable(), ViewModel<HomeView> {

    abstract fun onClick(view: View)
}
