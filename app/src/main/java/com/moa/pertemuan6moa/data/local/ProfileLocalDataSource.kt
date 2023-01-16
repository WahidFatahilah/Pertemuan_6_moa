package com.moa.pertemuan6moa.data.local

class ProfileLocalDataSource {
 val database = Database()
    fun getProfile() = database.getProfile()



}