package com.moa.pertemuan6moa.ui.feature.main

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.moa.pertemuan6moa.R
import com.moa.pertemuan6moa.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val mainViewModel : MainViewModel by viewModels()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profileState = mainViewModel.profileState
        mainViewModel.getProfile()
        lifecycleScope.launch{
            profileState.collect { profile ->
                binding.profileTv.text = "${profile.name}, ${profile.age} tahun"
            }
        }
    }
}