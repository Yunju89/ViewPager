package com.example.viewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewpager.databinding.ActivityMainBinding
import com.example.viewpager.viewpager1.ViewPager1Activity
import com.example.viewpager.viewpager1.Viewpager1Adapter

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.viewpager1.setOnClickListener {
            val myIntent = Intent(this, ViewPager1Activity::class.java)
            startActivity(myIntent)
        }



    }
}