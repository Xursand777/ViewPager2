package com.x7.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class SlideAdapter constructor(
    val lifecycle: Lifecycle,
    val fragmentManager: FragmentManager,
    val fragmentarraylist: ArrayList<Fragment>

):FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int = fragmentarraylist.size

    override fun createFragment(position: Int): Fragment {
        return fragmentarraylist.get(position)
    }


}