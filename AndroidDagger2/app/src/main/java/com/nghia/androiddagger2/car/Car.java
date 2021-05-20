package com.nghia.androiddagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by nghia.vuong on 19,May,2021
 */
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void driver(){
        engine.start();
        Log.d(TAG, "driver: ...");
    }
}

