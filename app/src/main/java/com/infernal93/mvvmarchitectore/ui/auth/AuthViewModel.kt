package com.infernal93.mvvmarchitectore.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

/**
 * Created by Armen Mkhitaryan on 25.12.2019.
 */
class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun testLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password... Try again")
            return
        }
        authListener?.onSuccess()
    }
}