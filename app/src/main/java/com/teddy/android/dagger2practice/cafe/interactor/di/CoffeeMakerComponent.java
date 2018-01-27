package com.teddy.android.dagger2practice.cafe.interactor.di;

import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.CoffeeBean;
import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.CoffeeMaker;

import java.util.Map;

import dagger.Subcomponent;

@CoffeeScope
@Subcomponent(modules = {
        CoffeeMakerModule.class
        ,CoffeeBeanModule.class
})
public interface CoffeeMakerComponent {

    CoffeeMaker coffeeMaker();
    CoffeeBean coffeebean();
    Map<String,CoffeeBean> coffeeBeanMap();

    @Subcomponent.Builder
    interface Builder {
        Builder coffeeMakerModule(CoffeeMakerModule coffeeMakerModule);
        CoffeeMakerComponent build();
    }
}
