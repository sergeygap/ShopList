package com.sergey_gap.shoplist.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sergey_gap.shoplist.R
import com.sergey_gap.shoplist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }

    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {
                    Log.d("TAG", "Setting")
                }
                R.id.notes -> {
                    Log.d("TAG", "notes")
                }
                R.id.shop_list -> {
                    Log.d("TAG", "Shop List")
                }
                R.id.new_item -> {
                    Log.d("TAG", "New Item")

                }
            }

            true
        }
    }


}