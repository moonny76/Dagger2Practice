package com.teddy.android.dagger2practice.cafe.view.di.components;

import com.teddy.android.dagger2practice.cafe.view.app.MenuFragment;
import com.teddy.android.dagger2practice.cafe.view.di.FragmentScope;
import com.teddy.android.dagger2practice.cafe.view.di.modules.MenuModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@FragmentScope
@Subcomponent(modules = MenuModule.class)
public interface MenuFragmentComponent extends AndroidInjector<MenuFragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MenuFragment>{};

}
