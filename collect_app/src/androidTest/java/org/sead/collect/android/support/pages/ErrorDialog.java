package org.sead.collect.android.support.pages;

import androidx.test.rule.ActivityTestRule;

import org.sead.collect.android.R;

public class ErrorDialog extends OkDialog {
    ErrorDialog(ActivityTestRule rule) {
        super(rule);
    }

    @Override
    public ErrorDialog assertOnPage() {
        super.assertOnPage();
        checkIsStringDisplayed(R.string.error_occured);
        return this;
    }
}