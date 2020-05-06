package org.sead.collect.android.preferences;

import android.os.Bundle;

import androidx.annotation.Nullable;

import org.sead.collect.android.R;
import org.sead.collect.android.activities.CollectAbstractActivity;

public class FormMetadataPreferencesActivity extends CollectAbstractActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.androidx_preferences_activity);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings_container, new FormMetadataFragment())
                .commit();
    }
}
