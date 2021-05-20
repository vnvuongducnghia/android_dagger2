package com.nghia.androiddagger2.dagger;


import com.nghia.androiddagger2.MainActivity;
import com.nghia.androiddagger2.car.Car;

import dagger.Component;

/**
 * Created by nghia.vuong on 19,May,2021
 */

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

}
