package com.teddy.android.dagger2practice.cafe.app;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MovieFragmentComponent.class)
public abstract class MainModule {

    @ActivityScope
    @Binds
    abstract MainActivityContract.View bindView(MainActivity activity);

    @ActivityScope
    @Binds
    public abstract MainActivityContract.Presenter bindPresenter(MainPresenterImpl mainPresenter);

    @Binds
    @IntoMap
    @FragmentKey(MoviesFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMoviesFragment(MovieFragmentComponent.Builder builder);
}
