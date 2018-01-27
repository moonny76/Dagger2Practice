package com.teddy.android.dagger2practice.cafe.app;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainComponent.class)
abstract class AppModule {

    @Singleton
    @Binds
    abstract DataSource bindDataSource(DatasourceImpl datasource);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainComponent.Builder builder);
}
