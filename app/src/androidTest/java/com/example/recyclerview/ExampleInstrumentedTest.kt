package com.example.recyclerview

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.recyclerview.CustomMatchers.Companion.withItemCount

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
class RecyclerViewTest {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    val itemsCount = 96

    @Test
    fun countItems() {
        Espresso.onView(withId(R.id.recycler_view))
            .check(ViewAssertions.matches(withItemCount(itemsCount)))
    }
}
