package com.teddy.android.dagger2practice.cafe.view.di.modules;

import android.app.Activity;

import com.teddy.android.dagger2practice.cafe.interactor.model.DataSource;
import com.teddy.android.dagger2practice.cafe.model.DatasourceImpl;
import com.teddy.android.dagger2practice.cafe.view.app.MainActivity;
import com.teddy.android.dagger2practice.cafe.view.di.components.MainComponent;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainComponent.class)
public abstract class AppModule {

    @Singleton
    @Binds
    abstract DataSource bindDataSource(DatasourceImpl datasource);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainComponent.Builder builder);
}
