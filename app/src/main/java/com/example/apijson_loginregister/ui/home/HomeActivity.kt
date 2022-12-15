package com.example.apijson_loginregister.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apijson_loginregister.R
import com.example.apijson_loginregister.base.activity.BaseActivity
import com.example.apijson_loginregister.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel> (R.layout.activity_home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}