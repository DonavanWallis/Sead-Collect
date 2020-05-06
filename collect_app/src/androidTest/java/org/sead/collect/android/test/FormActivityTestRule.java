package org.sead.collect.android.test;

import android.content.Intent;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.intent.rule.IntentsTestRule;

import org.sead.collect.android.activities.FormEntryActivity;
import org.sead.collect.android.storage.StoragePathProvider;
import org.sead.collect.android.storage.StorageSubdirectory;

import static org.sead.collect.android.activities.FormEntryActivity.EXTRA_TESTING_PATH;

public class FormActivityTestRule extends IntentsTestRule<FormEntryActivity> {

    private final String formFilename;

    public FormActivityTestRule(String formFilename) {
        super(FormEntryActivity.class);
        this.formFilename = formFilename;
    }

    @Override
    protected Intent getActivityIntent() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), FormEntryActivity.class);
        intent.putExtra(EXTRA_TESTING_PATH, new StoragePathProvider().getDirPath(StorageSubdirectory.FORMS) + "/" + formFilename);

        return intent;
    }
}