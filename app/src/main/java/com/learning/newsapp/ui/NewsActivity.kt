package com.learning.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learning.newsapp.R
import com.learning.newsapp.databinding.ActivityNewsBinding
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var view = binding.root
//        setContentView(R.layout.activity_news)
        setContentView(view)

        bottomNavigationView
    }
}