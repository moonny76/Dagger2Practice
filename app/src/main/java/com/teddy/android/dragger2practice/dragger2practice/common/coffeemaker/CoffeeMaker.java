package com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker;

import com.teddy.android.dragger2practice.dragger2practice.common.utils.Logger;

import javax.inject.Inject;

/**
 * Created by moonn on 2018-01-26.
 */

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

    public void brew() {
        mHeater.on();
        mPump.pump();
        Logger.e(TAG, " [__]P coffee! [__]P");
        mHeater.off();
    }
}
