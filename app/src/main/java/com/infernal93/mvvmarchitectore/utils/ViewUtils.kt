package com.infernal93.mvvmarchitectore.utils

import android.content.Context
import android.widget.Toast

/**
 * Created by Armen Mkhitaryan on 25.12.2019.
 */


fun Context.shortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}