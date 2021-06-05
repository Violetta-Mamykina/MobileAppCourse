package com.example.downloadimagelib

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(applicationContext)
            .load("https://i.artfile.ru/4500x3514_903167_[www.ArtFile.ru].jpg")
            .into(findViewById(R.id.dow_image))

    }
}


