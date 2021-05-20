package com.nghia.androiddagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by nghia.vuong on 20,May,2021
 */
class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
