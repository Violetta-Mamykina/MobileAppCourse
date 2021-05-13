package com.example.downloadimagecoroutines

import android.view.View
import org.hamcrest.Matcher

object EspressoTestsMatchers {

    fun existDrawable(): Matcher<View> {
        return DrawableMatcher()
    }

}