package com.teddy.android.dagger2practice.cafe.interactor.usecase;

import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.CoffeeBean;
import com.teddy.android.dagger2practice.cafe.interactor.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dagger2practice.cafe.interactor.di.CafeComponent;
import com.teddy.android.dagger2practice.cafe.interactor.di.CafeModule;
import com.teddy.android.dagger2practice.cafe.interactor.di.CoffeeMakerComponent;
import com.teddy.android.dagger2practice.cafe.interactor.di.DaggerCafeComponent;

public class MakeCoffee implements UseCase {

    @Override
    public void excute(Observer observer, Object param) {
        CafeComponent cafeComponent = DaggerCafeComponent.builder()
                .cafeModule(new CafeModule("test"))
                .build();
        cafeComponent.cafeInfo().welcome();
        CoffeeMakerComponent coffeeMakerComponent = cafeComponent.coffeeMakerComponent().build();
        CoffeeMaker coffeeMaker = coffeeMakerComponent.coffeeMaker();
        CoffeeBean coffeeBean = coffeeMakerComponent.coffeebean();
        coffeeBean.name();
        coffeeMaker.brew(coffeeBean);
        coffeeMakerComponent.coffeeBeanMap().get("guatemala").name();
    }
}
