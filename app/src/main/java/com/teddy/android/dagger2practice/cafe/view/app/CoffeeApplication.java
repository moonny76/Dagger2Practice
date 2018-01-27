package com.teddy.android.dagger2practice.cafe.view.app;

import android.app.Activity;
import android.app.Application;


import com.teddy.android.dagger2practice.cafe.view.di.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class CoffeeApplication extends Application implements HasActivityInjector{

    @Inject
    DispatchingAndroidInjector<Activity> mDispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mDispatchingActivityInjector;
    }
}
