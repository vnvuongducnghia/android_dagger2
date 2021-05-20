package com.nghia.androiddagger2.dagger;

import com.nghia.androiddagger2.car.Rims;
import com.nghia.androiddagger2.car.Tires;
import com.nghia.androiddagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nghia.vuong on 20,May,2021
 */
@Module
public class WheelsModule {

    // Để tăng hiệu suất thì dùng static để dagger không phải khởi tạo module này
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
