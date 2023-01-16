package com.moa.pertemuan6moa.ui.feature.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moa.pertemuan6moa.data.model.Profile
import com.moa.pertemuan6moa.data.repository.ProfileRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val profileRepository = ProfileRepository()

    private  val _profileState = MutableStateFlow(Profile())
    val profileState = _profileState.asStateFlow()

    fun getProfile(){
      viewModelScope.launch{

          profileRepository.getProfile().collect()
      }

    }

}