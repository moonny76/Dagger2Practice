package com.teddy.android.dagger2practice.cafe.view.di.components;

import com.teddy.android.dagger2practice.cafe.view.app.MainActivity;
import com.teddy.android.dagger2practice.cafe.view.di.ActivityScope;
import com.teddy.android.dagger2practice.cafe.view.di.modules.MainModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = MainModule.class)
public interface MainComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
