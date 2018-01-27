package com.teddy.android.dagger2practice.cafe.interactor.coffeemaker;

import com.teddy.android.dagger2practice.cafe.interactor.common.utils.Logger;

public class CafeInfo {

    private static final String TAG = "CafeInfo";
    private String mName;

    public CafeInfo() {

    }

    public CafeInfo(String name) {
        mName = name;
    }

    public void welcome() {
        Logger.e(TAG, "Welcome :" + (mName == null? "": mName));
    }

}
