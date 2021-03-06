package com.teddy.android.dagger2practice.cafe.interactor.di;

import com.teddy.android.dagger2practice.cafe.interactor.coffeemaker.CafeInfo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CafeModule.class)
public interface CafeComponent {
    CafeInfo cafeInfo();
    CoffeeMakerComponent.Builder coffeeMakerComponent();

    @Component.Builder
    interface Builder {
        Builder cafeModule(CafeModule cafeModule);
        CafeComponent build();
    }
}
