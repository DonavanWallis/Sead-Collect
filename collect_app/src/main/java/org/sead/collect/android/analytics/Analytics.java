package org.sead.collect.android.analytics;

public interface Analytics {

    void logEvent(String category, String action);

    void logEvent(String category, String action, String label);
}