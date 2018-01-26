package com.teddy.android.dagger2practice.coffee.coffeemaker;

import com.teddy.android.dagger2practice.coffee.common.coffeemaker.CoffeeBean;
import com.teddy.android.dagger2practice.coffee.common.utils.Logger;

import javax.inject.Inject;

public class GuatemalaBean  extends CoffeeBean {

    private static final String TAG = "GuatemalaBean";

    @Inject
    public GuatemalaBean(){
        super();
    }
    @Override
    public void name() {
        Logger.e(TAG, "GuatemalaBean");
    }

}