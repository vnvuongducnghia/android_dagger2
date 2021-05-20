package com.nghia.androiddagger2.dagger;

import com.nghia.androiddagger2.car.Engine;
import com.nghia.androiddagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by nghia.vuong on 20,May,2021
 */

/*@Module
class PetrolEngineModule {

    @Provides
    Engine providerEngine(PetrolEngine engine) {
        return engine;
    }
}*/
@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine providerEngine(PetrolEngine engine);
}
