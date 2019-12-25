package com.infernal93.mvvmarchitectore.ui.auth

/**
 * Created by Armen Mkhitaryan on 25.12.2019.
 */
interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}