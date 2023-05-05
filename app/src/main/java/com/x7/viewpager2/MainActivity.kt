package com.x7.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.x7.viewpager2.databinding.ActivityMainBinding
import com.x7.viewpager2.fragments.BlankFragment
import com.x7.viewpager2.fragments.BlankFragment2

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var arraylist=ArrayList<Fragment>()
    lateinit var slideAdapter: SlideAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arraylist.add(BlankFragment())
        arraylist.add(BlankFragment2())

        slideAdapter=SlideAdapter(lifecycle,supportFragmentManager,arraylist)
        binding.viewpager2.adapter=slideAdapter



    }
}