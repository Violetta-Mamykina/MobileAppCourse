package com.example.intent

import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.uiautomator.UiDevice

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
//    private val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//
//    private fun currentScreen(id: Int) {
//        Espresso.onView(ViewMatchers.withId(id))
//            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
//    }
//
//    private fun toScreen(idButton: Int, idScreen: Int) {
//        Espresso.onView(ViewMatchers.withId(idButton)).perform(ViewActions.click())
//        currentScreen(idScreen)
//    }
///*
//    private fun toAboutNavigationDrawer(idScreen: Int, idNav: Int) {
//        Espresso.onView(ViewMatchers.withId(idScreen)).perform(DrawerActions.open())
//        Espresso.onView(ViewMatchers.withId(idNav))
//            .perform(NavigationViewActions.navigateTo(R.id.to_about))
//        currentScreen(R.id.about_screen)
//    }
//
//    private fun toAboutBottomNavigation() {
//        toScreen(R.id.bottom_navigation, R.id.about_screen)
//    }
// */
//
//    private fun toAboutOptionsMenu() {
//        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
//        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
//        currentScreen(R.id.about_screen)
//    }
//
//    private fun toEnd() {
//        Espresso.pressBackUnconditionally()
//        val state = rule.scenario.state
//        assertEquals("DESTROYED", state.toString())
//    }
//
//    @get:Rule
//    val rule = activityScenarioRule<MainActivity>()
//
//    @Test
//    fun forFirstScreen() {
//        toScreen(R.id.to_second, R.id.second_screen)
//        Espresso.pressBack()
//        currentScreen(R.id.first_screen)
//
//        //for Navigation Drawer
////        toAboutNavigationDrawer(R.id.first_screen, R.id.nav_view_first)
//
//        //for Bottom Navigation
////        toAboutBottomNavigation()
//
//        //for Options Menu
//        toAboutOptionsMenu()
//
//        Espresso.pressBack()
//        currentScreen(R.id.first_screen)
//        uiDevice.setOrientationLeft()
//        currentScreen(R.id.first_screen)
//        toEnd()
//    }
//
//    @Test
//    fun forSecondScreen() {
//        toScreen(R.id.to_second, R.id.second_screen)
//        toScreen(R.id.to_first, R.id.first_screen)
//        toScreen(R.id.to_second, R.id.second_screen)
//        toScreen(R.id.to_third, R.id.third_screen)
//        Espresso.pressBack()
//        currentScreen(R.id.second_screen)
//
//        //for Navigation Drawer
////        toAboutNavigationDrawer(R.id.second_screen, R.id.nav_view_second)
//
//        //for Bottom Navigation
////        toAboutBottomNavigation()
//
//        //for Options Menu
//        toAboutOptionsMenu()
//
//        Espresso.pressBack()
//        currentScreen(R.id.second_screen)
//        uiDevice.setOrientationLeft()
//        currentScreen(R.id.second_screen)
//        Espresso.pressBack()
//        currentScreen(R.id.first_screen)
//        toEnd()
//    }
//
//    @Test
//    fun forThirdScreen() {
//        toScreen(R.id.to_second, R.id.second_screen)
//        toScreen(R.id.to_third, R.id.third_screen)
//        toScreen(R.id.to_first_t, R.id.first_screen)
//        toScreen(R.id.to_second, R.id.second_screen)
//        toScreen(R.id.to_third, R.id.third_screen)
//        toScreen(R.id.to_second_t, R.id.second_screen)
//        toScreen(R.id.to_third, R.id.third_screen)
//
//        //for Navigation Drawer
////        toAboutNavigationDrawer(R.id.third_screen, R.id.nav_view_third)
//
//        //for Bottom Navigation
////        toAboutBottomNavigation()
//
//        //for Options Menu
//        toAboutOptionsMenu()
//
//        Espresso.pressBack()
//        currentScreen(R.id.third_screen)
//        uiDevice.setOrientationLeft()
//        currentScreen(R.id.third_screen)
//        Espresso.pressBack()
//        currentScreen(R.id.second_screen)
//        Espresso.pressBack()
//        currentScreen(R.id.first_screen)
//        toEnd()
//    }
}



