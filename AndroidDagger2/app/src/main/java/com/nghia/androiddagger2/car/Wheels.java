package com.nghia.androiddagger2.car;

/**
 * Created by nghia.vuong on 19,May,2021
 */
public class Wheels {

    // We don't own this class so we can't annotate it with Inject.

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
