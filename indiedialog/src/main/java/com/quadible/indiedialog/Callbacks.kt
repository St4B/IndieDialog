package com.quadible.indiedialog

import android.support.annotation.IdRes

interface PositiveButton {

    fun onPositiveClick(@IdRes id: Int)

}

interface NegativeButton {

    fun onNegativeClick(@IdRes id: Int)

}

interface NeutralButton {

    fun onNeutralClick(@IdRes id: Int)

}