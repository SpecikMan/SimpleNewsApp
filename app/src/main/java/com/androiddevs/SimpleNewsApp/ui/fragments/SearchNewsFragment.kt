package com.androiddevs.SimpleNewsApp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.androiddevs.SimpleNewsApp.R
import com.androiddevs.SimpleNewsApp.ui.NewsActivity
import com.androiddevs.SimpleNewsApp.ui.NewsViewModel

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {
    lateinit var viewModel : NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}