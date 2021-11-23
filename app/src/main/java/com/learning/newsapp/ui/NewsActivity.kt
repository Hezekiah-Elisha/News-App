package com.learning.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.learning.newsapp.R
import com.learning.newsapp.databinding.ActivityNewsBinding
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        var view = binding.root
//        setContentView(R.layout.activity_news)
        setContentView(binding.root)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}