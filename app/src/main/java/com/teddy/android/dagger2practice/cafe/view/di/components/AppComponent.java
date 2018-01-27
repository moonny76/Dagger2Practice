package com.teddy.android.dagger2practice.cafe.view.di.components;

import com.teddy.android.dagger2practice.cafe.view.app.CoffeeApplication;
import com.teddy.android.dagger2practice.cafe.view.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class
})
public interface AppComponent {
    void inject(CoffeeApplication coffeeApplication);
}
