package com.teddy.android.dragger2practice.dragger2practice.coffeemaker;

import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Heater;
import com.teddy.android.dragger2practice.dragger2practice.common.utils.Logger;

/**
 * Created by moonn on 2018-01-26.
 */

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
