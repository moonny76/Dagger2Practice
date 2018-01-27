package com.teddy.android.dagger2practice.cafe.app;

import javax.inject.Inject;

public class MoviesPresenterImpl implements MovieFragmentContract.Presenter{
    private MovieFragmentContract.View mView;
    private DataSource mDatasource;

    @Inject
    public MoviesPresenterImpl(MovieFragmentContract.View view, DataSource dataSource) {
        mView = view;
        mDatasource = dataSource;
    }
    @Override
    public void loadMovies(String category) {
        mView.setList(mDatasource.getMovies(category));
    }
}
