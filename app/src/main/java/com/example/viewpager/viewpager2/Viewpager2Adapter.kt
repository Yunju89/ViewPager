package com.example.viewpager.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Viewpager2Adapter(fa : FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() : Int{
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment2()
            2 -> SecondFragment2()
            else -> ThirdFragment2()
        }
    }
}