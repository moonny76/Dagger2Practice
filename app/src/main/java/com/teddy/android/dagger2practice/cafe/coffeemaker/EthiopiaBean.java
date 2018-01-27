package com.teddy.android.dagger2practice.cafe.coffeemaker;

import com.teddy.android.dagger2practice.cafe.common.coffeemaker.CoffeeBean;
import com.teddy.android.dagger2practice.cafe.common.utils.Logger;

public class EthiopiaBean extends CoffeeBean {

    private static final String TAG = "EthiopiaBean";

    @Override
    public void name() {
        Logger.e(TAG, "EthiopiaBean");
    }

}
