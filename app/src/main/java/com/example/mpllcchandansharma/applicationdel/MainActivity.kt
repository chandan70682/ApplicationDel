package com.example.mpllcchandansharma.applicationdel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun crash(v: View)
    {
       throw RuntimeException("exception");
    }
}
