package org.sead.collect.android.formentry.saving;

import android.net.Uri;

import org.sead.collect.android.logic.FormController;
import org.sead.collect.android.tasks.SaveToDiskResult;

public interface FormSaver {
    SaveToDiskResult save(Uri instanceContentURI, FormController formController, boolean shouldFinalize, boolean exitAfter, String updatedSaveName, ProgressListener progressListener);

    interface ProgressListener {
        void onProgressUpdate(String message);
    }
}
