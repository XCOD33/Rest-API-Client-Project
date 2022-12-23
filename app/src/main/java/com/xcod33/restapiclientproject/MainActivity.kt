package com.xcod33.restapiclientproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xcod33.restapiclientproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragment()
    }

    private fun showFragment() {
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = FragmentData()

        mFragmentTransaction.add(R.id.fl_data, mFragment).commit()
    }
}