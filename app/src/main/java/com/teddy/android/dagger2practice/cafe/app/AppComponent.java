package com.teddy.android.dagger2practice.cafe.app;

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
