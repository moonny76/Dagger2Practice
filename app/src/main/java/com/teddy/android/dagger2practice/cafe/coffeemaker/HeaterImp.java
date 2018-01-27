package com.teddy.android.dagger2practice.cafe.coffeemaker;

import com.teddy.android.dagger2practice.cafe.common.coffeemaker.Heater;
import com.teddy.android.dagger2practice.cafe.common.utils.Logger;

public class HeaterImp implements Heater {

    private static final String TAG = "HeaterImp";
    private boolean mIsBoring;

    @Override
    public void on() {
        Logger.e(TAG, "Heating in " + this.getClass().getSimpleName());
        mIsBoring = true;
    }

    @Override
    public void off() {
        mIsBoring = false;
    }

    @Override
    public boolean isHot() {
        return mIsBoring;
    }
}
