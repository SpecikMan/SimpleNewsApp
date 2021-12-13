package com.androiddevs.SimpleNewsApp.ui

import androidx.lifecycle.ViewModel
import com.androiddevs.SimpleNewsApp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) :ViewModel(){
}