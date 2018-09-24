package com.motherteresa53.quizapp;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartScreenActivityTest {

    @Rule
    public ActivityTestRule<StartScreenActivity> sActivityTestRule = new ActivityTestRule<StartScreenActivity>(StartScreenActivity.class);

    private StartScreenActivity sActivity = null;


    @Before
    public void setUp() throws Exception {

        sActivity = sActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){

        View view = sActivity.findViewById(R.id.text_view_question);

        //if text_view_title is not null then my test is successful
        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {

        sActivity = null;
    }
}