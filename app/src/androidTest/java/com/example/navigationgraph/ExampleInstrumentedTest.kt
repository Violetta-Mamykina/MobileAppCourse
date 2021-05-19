package com.example.navigationgraph

import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.UiDevice

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
class NavigationTest {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    @Test
    fun forFirstScreen() {
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Navigation Drawer
//        Espresso.onView(ViewMatchers.withId(R.id.first_screen)).perform(DrawerActions.open())
//        Espresso.onView(ViewMatchers.withId(R.id.nav_view_first))
//            .perform(NavigationViewActions.navigateTo(R.id.toAbout))
//        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Bottom Navigation
//        Espresso.onView(ViewMatchers.withId(R.id.bottom_navigation)).perform(ViewActions.click())
//        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Options Menu
        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        uiDevice.setOrientationLeft()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBackUnconditionally()
        val state = rule.scenario.state
        assertEquals("DESTROYED", state.toString())
    }

    @Test
    fun forSecondScreen() {
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toFirst)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.third_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Navigation Drawer
//        Espresso.onView(ViewMatchers.withId(R.id.second_screen)).perform(DrawerActions.open())
//        Espresso.onView(ViewMatchers.withId(R.id.nav_view_second))
//            .perform(NavigationViewActions.navigateTo(R.id.toAbout))
//        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Bottom Navigation
//        Espresso.onView(ViewMatchers.withId(R.id.bottom_navigation)).perform(ViewActions.click())
//        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Options Menu
        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        uiDevice.setOrientationLeft()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBackUnconditionally()
        val state = rule.scenario.state
        assertEquals("DESTROYED", state.toString())
    }
    @Test
    fun forThirdScreen() {
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toFirstOther)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toSecondOther)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())

        //for Navigation Drawer
//        Espresso.onView(ViewMatchers.withId(R.id.third_screen)).perform(DrawerActions.open())
//        Espresso.onView(ViewMatchers.withId(R.id.nav_view_third))
//            .perform(NavigationViewActions.navigateTo(R.id.toAbout))
//        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Bottom Navigation
//        Espresso.onView(ViewMatchers.withId(R.id.bottom_navigation)).perform(ViewActions.click())
//        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        //for Options Menu
        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))

        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.third_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        uiDevice.setOrientationLeft()
        Espresso.onView(ViewMatchers.withId(R.id.third_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBackUnconditionally()
        val state = rule.scenario.state
        assertEquals("DESTROYED", state.toString())
    }
}
