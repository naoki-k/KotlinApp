package com.sales.pages

interface ViewModel<T : BaseView> {

    fun init(view: T)
}
