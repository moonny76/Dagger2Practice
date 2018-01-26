package com.teddy.android.dagger2practice.coffee.di;

import com.teddy.android.dagger2practice.coffee.coffeemaker.EthiopiaBean;
import com.teddy.android.dagger2practice.coffee.coffeemaker.GuatemalaBean;
import com.teddy.android.dagger2practice.coffee.common.coffeemaker.CoffeeBean;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class CoffeeBeanModule {

    @Binds
    abstract CoffeeBean provideCoffeeBean(EthiopiaBean ethiopiaBean);

    @Binds
    @IntoMap
    @StringKey("ethiopia")
    abstract CoffeeBean provideEthiopiaBean(EthiopiaBean ethiopiaBean);

    @Binds
    @IntoMap
    @StringKey("guatemala")
    abstract CoffeeBean provideGuatemalaBean(GuatemalaBean guatemalaBean);
}