package com.moa.pertemuan6moa.data.local

import com.moa.pertemuan6moa.data.model.Profile
import kotlinx.coroutines.flow.flow

class Database {

    fun getProfile() = flow { emit(Profile ( name = "Daniel", age = 20))  }


    }
