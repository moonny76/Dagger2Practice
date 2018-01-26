package com.teddy.android.dagger2practice.coffee.common.coffeemaker;

import com.teddy.android.dagger2practice.coffee.common.utils.Logger;

import javax.inject.Inject;

public class CoffeeMaker {

    private static final String TAG = "CoffeeMaker";
    @Inject
    Heater mHeater;
    @Inject
    Pump mPump;

    public CoffeeMaker(Heater heater, Pump pump) {
        mHeater = heater;
        mPump = pump;
    }

    public CoffeeMaker() {

    }

    public void brew(CoffeeBean coffeeBean) {
        mHeater.on();
        mPump.pump();
        Logger.e(TAG, " [__]P coffee! [__]P");
        mHeater.off();
    }
}
