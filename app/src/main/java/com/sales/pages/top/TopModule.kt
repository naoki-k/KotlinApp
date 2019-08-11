package com.sales.pages.top

import com.sales.pages.home.HomeViewModel
import com.sales.pages.home.HomeViewModelImpl
import dagger.Binds
import dagger.Module

@Module
abstract class TopModule {

    @Binds
    internal abstract fun bindHomeViewModel(viewModel: HomeViewModelImpl): HomeViewModel
}
