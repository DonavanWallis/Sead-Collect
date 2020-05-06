package org.sead.collect.android.formentry.media;

import android.content.Context;

import org.sead.collect.android.audio.AudioHelper;

public interface AudioHelperFactory {

    AudioHelper create(Context context);
}
