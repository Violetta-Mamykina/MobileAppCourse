package com.example.downloadimageasynctask

import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.downloadimageasynctask.EspressoTestsMatchers.existDrawable

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ImageViewTest {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    @Test
    fun checkImageView() {
        SystemClock.sleep(5000)
        Espresso.onView(ViewMatchers.withId(R.id.dow_image))
            .check(ViewAssertions.matches(existDrawable()))
    }
}
