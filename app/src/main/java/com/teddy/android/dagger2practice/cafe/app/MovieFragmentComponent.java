package com.teddy.android.dagger2practice.cafe.app;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@FragmentScope
@Subcomponent(modules = MovieModule.class)
public interface MovieFragmentComponent extends AndroidInjector<MoviesFragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MoviesFragment>{};

}
