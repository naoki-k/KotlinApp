package com.sales.pages.my_page

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sales.R
import com.sales.databinding.FragmentMyPageBinding

class MyPageFragment : Fragment(), MyPageView {
    private var viewModel: MyPageViewModel? = null
    private var binding: FragmentMyPageBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMyPageBinding.bind(view)
        viewModel = MyPageViewModelImpl()
        viewModel?.init(this)
        binding?.viewModel = viewModel
    }

    companion object {

        fun createInstance(): MyPageFragment {
            return MyPageFragment()
        }
    }
}
