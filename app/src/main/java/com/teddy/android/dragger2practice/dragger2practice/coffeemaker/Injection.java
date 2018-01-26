package com.teddy.android.dragger2practice.dragger2practice.coffeemaker;

import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Heater;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Pump;

/**
 * Created by moonn on 2018-01-26.
 */

public class Injection {

    public static Heater provideHeater() {
        return new HeaterImp();
    }

    public static Pump providePump() {
        return new PumpImp(provideHeater());
    }

    public static CoffeeMaker provideCoffeeMaker() {
        return new CoffeeMaker(provideHeater(), providePump());
    }
}
