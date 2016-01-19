package com.adalbertofjr.sayhelloespresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by AdalbertoF on 19/01/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    /**
     * Habilitando uma activity para ser testada.
     */
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void sayHelloEspresso(){
        onView(withId(R.id.txvHello)).check(matches(withText("Hello, !")));

    }

    @Test
    public void test_activity_has_name_edit(){
        onView(withId(R.id.txtName)).check(matches(withText("")));
    }

    @Test
    public void test_activity_has_button_say_hello(){
        onView(withId(R.id.btnSayHello)).check(matches(withText("Say Hello!")));
    }
}
