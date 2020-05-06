package org.sead.collect.android.regression;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.sead.collect.android.activities.MainMenuActivity;

public class BaseRegressionTest {

    @Rule
    public ActivityTestRule<MainMenuActivity> rule = new ActivityTestRule<>(MainMenuActivity.class);
}