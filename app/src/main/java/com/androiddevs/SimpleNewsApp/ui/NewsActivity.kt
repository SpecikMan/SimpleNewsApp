package com.androiddevs.SimpleNewsApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.androiddevs.SimpleNewsApp.databinding.ActivityNewsBinding
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())

    }
}
