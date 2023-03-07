package com.sergey_gap.shoplist.fragment

import androidx.appcompat.app.AppCompatActivity
import com.sergey_gap.shoplist.R

object FragmentManager { //объект необходим для сохранения состояния фрагментов, он будет записывать, какой фрагмент сейчас активек
    var currentFragment: BaseFragment? = null
    fun setFragment(newFragment: BaseFragment, activity: AppCompatActivity) {
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeHolder, newFragment)
        transaction.commit()
        currentFragment = newFragment
    }
}