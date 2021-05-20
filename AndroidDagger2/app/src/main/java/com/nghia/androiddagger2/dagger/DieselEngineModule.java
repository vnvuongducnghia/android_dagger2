package com.nghia.androiddagger2.dagger;

import com.nghia.androiddagger2.car.DieselEngine;
import com.nghia.androiddagger2.car.Engine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by nghia.vuong on 20,May,2021
 */

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine providerEngine(DieselEngine engine);
}