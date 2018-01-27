package com.teddy.android.dagger2practice.cafe.interactor.coffeemaker;

import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.Heater;
import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.Pump;
import com.teddy.android.dagger2practice.cafe.interactor.common.utils.Logger;

public class PumpImp implements Pump {

    private static final String TAG = "PumpImp";
    private final Heater mHeater;

    public PumpImp(Heater heater) {
        mHeater = heater;
    }

    @Override
    public void pump() {
        if (mHeater.isHot()) {
            Logger.e(TAG, "Pumping in " + this.getClass().getSimpleName());
        }
    }
}
