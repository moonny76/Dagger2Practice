package com.teddy.android.dagger2practice.cafe.app;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MovieModule {

    @FragmentScope
    @Binds
    abstract MovieFragmentContract.Presenter bindPresenter(MoviesPresenterImpl moviesPresenter);

    @FragmentScope
    @Binds
    abstract MovieFragmentContract.View bindView(MoviesFragment moviesFragment);
}
