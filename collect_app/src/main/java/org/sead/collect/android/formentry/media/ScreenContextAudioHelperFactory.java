package org.sead.collect.android.formentry.media;

import android.content.Context;

import org.sead.collect.android.audio.AudioHelper;
import org.sead.collect.android.utilities.ScreenContext;

public class ScreenContextAudioHelperFactory implements AudioHelperFactory {

    public AudioHelper create(Context context) {
        ScreenContext screenContext = (ScreenContext) context;
        return new AudioHelper(screenContext.getActivity(), screenContext.getViewLifecycle());
    }
}
