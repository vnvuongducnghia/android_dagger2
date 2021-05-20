package com.nghia.androiddagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by nghia.vuong on 20,May,2021
 */
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
