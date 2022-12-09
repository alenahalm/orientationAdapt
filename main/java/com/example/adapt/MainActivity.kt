package com.example.adapt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.OrientationEventListener
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var ids: IntArray
    var index = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.button)
        ids = intArrayOf(R.drawable.car1, R.drawable.car2, R.drawable.car3)
    }

    fun onChangePictureClick(v: View) {
        val iv = findViewById<ImageView>(R.id.picture)

        iv.setImageDrawable(getDrawable(ids[index]))
        index++
        index %= ids.size
    }
}