package com.teddy.android.dragger2practice.dragger2practice.coffeemaker;

import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Heater;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Pump;
import com.teddy.android.dragger2practice.dragger2practice.common.utils.Logger;

/**
 * Created by moonn on 2018-01-26.
 */

public class PumpImp implements Pump {

    private static final String TAG = "PumpImp";
    private final Heater mHeater;

    public PumpImp(Heater heater) {
        mHeater = heater;
    }

    @Override
    public void pump() {
        if (mHeater.isHot()) {
            Logger.e(TAG, "Puming in " + this.getClass().getSimpleName());
        }
    }
}
