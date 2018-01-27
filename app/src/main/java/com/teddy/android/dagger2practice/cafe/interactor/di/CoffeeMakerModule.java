package com.teddy.android.dagger2practice.cafe.interactor.di;

import com.teddy.android.dagger2practice.cafe.interactor.coffeemaker.EthiopiaBean;
import com.teddy.android.dagger2practice.cafe.interactor.coffeemaker.HeaterImp;
import com.teddy.android.dagger2practice.cafe.interactor.coffeemaker.PumpImp;
import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.Heater;
import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.Pump;

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
