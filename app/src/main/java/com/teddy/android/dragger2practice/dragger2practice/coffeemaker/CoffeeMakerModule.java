package com.teddy.android.dragger2practice.dragger2practice.coffeemaker;

import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Heater;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Pump;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by moonn on 2018-01-26.
 */

@Module
public class CoffeeMakerModule {

    @Provides @Singleton
    Heater providerHeater() {
        return new HeaterImp();
    }

    @Provides @Singleton
    Pump providerPump(Heater heater) {
        return new PumpImp(heater);
    }
}
