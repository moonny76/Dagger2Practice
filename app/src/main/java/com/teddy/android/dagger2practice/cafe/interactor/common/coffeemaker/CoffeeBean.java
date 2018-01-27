package com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker;

import com.teddy.android.dagger2practice.cafe.interactor.common.utils.Logger;

public class CoffeeBean {

    private static final String TAG = "CoffeeBean";

    public void name() {
        Logger.e(TAG, "CoffeeBean" );
    }
}