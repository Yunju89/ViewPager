package com.example.viewpager.viewpager2

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.R
import com.example.viewpager.databinding.ActivityViewPager2Binding

class ViewPager2Activity : AppCompatActivity() {

    lateinit var binding : ActivityViewPager2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_pager2)


        binding.viewpager2.adapter = Viewpager2Adapter(this)
        binding.viewpager2.orientation = ViewPager2.ORIENTATION_VERTICAL


    }
}