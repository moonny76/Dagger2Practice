package com.teddy.android.dagger2practice.coffee.coffeemaker;

import com.teddy.android.dagger2practice.coffee.common.coffeemaker.CoffeeBean;
import com.teddy.android.dagger2practice.coffee.common.utils.Logger;

public class EthiopiaBean extends CoffeeBean {

    private static final String TAG = "EthiopiaBean";

    @Override
    public void name() {
        Logger.e(TAG, "EthiopiaBean");
    }

}
