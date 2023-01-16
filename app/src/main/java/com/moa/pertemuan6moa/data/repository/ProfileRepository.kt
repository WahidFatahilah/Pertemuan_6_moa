package com.moa.pertemuan6moa.data.repository

import com.moa.pertemuan6moa.data.local.ProfileLocalDataSource

class ProfileRepository {

    val profileLocalDataSourceRepository = ProfileLocalDataSource()

    fun getProfile() = profileLocalDataSourceRepository.getProfile()

}