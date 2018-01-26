package com.teddy.android.dagger2practice.coffee.di;

import com.teddy.android.dagger2practice.coffee.coffeemaker.CafeInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CoffeeMakerComponent.class)
public class CafeModule {

    private String mName;

    public CafeModule(String name) {
        mName = name;
    }

    @Singleton
    @Provides
    CafeInfo provideCafeInfo() {
        if (mName != null && !mName.isEmpty()) {
            return new CafeInfo();
        } else {
            return new CafeInfo(mName);
        }
    }
}
