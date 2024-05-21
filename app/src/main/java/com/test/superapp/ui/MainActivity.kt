package com.test.superapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.test.superapp.R
import com.test.superutils.Test

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)
        Test().A

    }
}

