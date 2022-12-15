package com.example.apijson_loginregister.ui.splash

//import android.annotation.SuppressLint
import android.os.Bundle
import com.crocodic.core.extension.openActivity
import com.example.apijson_loginregister.R
import com.example.apijson_loginregister.base.activity.BaseActivity
import com.example.apijson_loginregister.databinding.ActivitySplashBinding
import com.example.apijson_loginregister.ui.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint

//@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.splash {
            openActivity<LoginActivity>()
            finish()
        }
    }
}