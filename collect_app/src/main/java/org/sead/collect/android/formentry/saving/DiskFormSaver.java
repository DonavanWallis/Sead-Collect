package org.sead.collect.android.formentry.saving;

import android.net.Uri;

import org.sead.collect.android.logic.FormController;
import org.sead.collect.android.tasks.SaveFormToDisk;
import org.sead.collect.android.tasks.SaveToDiskResult;

public class DiskFormSaver implements FormSaver {

    @Override
    public SaveToDiskResult save(Uri instanceContentURI, FormController formController, boolean shouldFinalize, boolean exitAfter, String updatedSaveName, ProgressListener progressListener) {
        SaveFormToDisk saveFormToDisk = new SaveFormToDisk(formController, exitAfter, shouldFinalize, updatedSaveName, instanceContentURI);
        return saveFormToDisk.saveForm(progressListener);
    }
}
