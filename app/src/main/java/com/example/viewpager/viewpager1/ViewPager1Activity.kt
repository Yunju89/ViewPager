package com.example.viewpager.viewpager1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewpager.R
import com.example.viewpager.databinding.ActivityViewPager1Binding

class ViewPager1Activity : AppCompatActivity() {
    lateinit var binding : ActivityViewPager1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_pager1)


        val mAdapter = Viewpager1Adapter(supportFragmentManager)
        binding.viewpager1.adapter = mAdapter


    }
}