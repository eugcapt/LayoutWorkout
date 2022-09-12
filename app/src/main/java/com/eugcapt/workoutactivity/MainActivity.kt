package com.eugcapt.workoutactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.eugcapt.workoutactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit  var  activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.button.setOnClickListener { changeText() }

    }

    private fun changeText() {
        activityMainBinding.textView.setText("Data Binding")
    }
}