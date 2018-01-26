package com.teddy.android.dragger2practice.dragger2practice.di;

import com.teddy.android.dragger2practice.dragger2practice.coffeemaker.CoffeeMakerModule;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.CoffeeMaker;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by moonn on 2018-01-26.
 */

@Singleton
@Component(modules = CoffeeMakerModule.class)
public interface CoffeeMakerComponent {

    void inject(CoffeeMaker coffeeMaker);
}
