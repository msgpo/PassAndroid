package org.ligi.ticketviewer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

public class NotTracker implements TrackerInterface {
    @Override
    public void init(Context ctx) {
        
    }

    @Override
    public void trackException(String s, Exception e, boolean fatal) {

    }

    @Override
    public void trackException(String s, boolean fatal) {

    }

    @Override
    public void trackEvent(String category, String action, String label, Long val) {

    }

    @Override
    public void activityStart(FragmentActivity activity) {

    }

    @Override
    public void activityStop(FragmentActivity activity) {

    }
}