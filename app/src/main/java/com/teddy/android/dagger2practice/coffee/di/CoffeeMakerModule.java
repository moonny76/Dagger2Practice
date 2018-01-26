package com.teddy.android.dagger2practice.coffee.di;

import com.teddy.android.dagger2practice.coffee.coffeemaker.EthiopiaBean;
import com.teddy.android.dagger2practice.coffee.coffeemaker.HeaterImp;
import com.teddy.android.dagger2practice.coffee.coffeemaker.PumpImp;
import com.teddy.android.dagger2practice.coffee.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dagger2practice.coffee.common.coffeemaker.Heater;
import com.teddy.android.dagger2practice.coffee.common.coffeemaker.Pump;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeMakerModule {

    @Provides @CoffeeScope
    CoffeeMaker providerCoffeeMaker(Heater heater, Pump pump) {
        return new CoffeeMaker(heater, pump);
    }

    @Provides @CoffeeScope
    Heater providerHeater() {
        return new HeaterImp();
    }

    @Provides @CoffeeScope
    Pump providerPump(Heater heater) {
        return new PumpImp(heater);
    }

    @Provides
    EthiopiaBean providerEthiopiaBean() {
        return new EthiopiaBean();
    }
}
