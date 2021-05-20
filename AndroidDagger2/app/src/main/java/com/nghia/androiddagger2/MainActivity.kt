package com.nghia.androiddagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nghia.androiddagger2.car.Car
import com.nghia.androiddagger2.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    /*@Inject
    private var car: Car? = null
    error: Dagger does not support injection into private fields*/

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.driver()
    }
}
