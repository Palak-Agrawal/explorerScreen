package com.example.exploreremulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.facebook.drawee.backends.pipeline.Fresco

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this);

        //val mainBinding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       // mainBinding.recyclerView
    }
}