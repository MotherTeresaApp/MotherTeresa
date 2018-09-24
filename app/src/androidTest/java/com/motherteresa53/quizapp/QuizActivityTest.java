package com.motherteresa53.quizapp;


import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotNull;

public class QuizActivityTest {

    @Rule
    public ActivityTestRule<QuizActivity> sActivityTestRule = new ActivityTestRule<QuizActivity>(QuizActivity.class);

    private QuizActivity sActivity = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(QuizActivity.class.getName(),null,false);


    @Before
    public void setUp() throws Exception {

        sActivity = sActivityTestRule.getActivity();

    }

    @Test
    public void testButtonOnClick(){

        assertNotNull(sActivity.findViewById(R.id.button_confirm_next));
        onView(withId(R.id.button_confirm_next)).perform(click());
        Activity quizActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 3000);
        assertNotNull(quizActivity);

    }

    @After
    public void tearDown() throws Exception {

        sActivity = null;
    }

}