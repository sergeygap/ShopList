package com.sergey_gap.shoplist.activities

import android.app.Application
import com.sergey_gap.shoplist.db.MainDataBase


class MainApp : Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}