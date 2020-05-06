package org.sead.collect.android.storage.migration;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

import org.sead.collect.android.application.Collect;

import javax.inject.Inject;

public class StorageMigrationService extends IntentService {
    @Inject
    StorageMigrator storageMigrator;

    public StorageMigrationService() {
        super("StorageMigrationService");
        Collect.getInstance().getComponent().inject(this);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        storageMigrator.performStorageMigration();
    }
}
