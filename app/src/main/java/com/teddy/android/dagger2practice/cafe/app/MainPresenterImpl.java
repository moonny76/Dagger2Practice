package com.teddy.android.dagger2practice.cafe.app;

import javax.inject.Inject;

class MainPresenterImpl implements MainActivityContract.Presenter{

    MainActivityContract.View view;
    DataSource dataSource;

    @Inject
    public MainPresenterImpl(MainActivityContract.View view, DataSource dataSource){
        this.view = view;
        this.dataSource = dataSource;
    }

    @Override
    public void loadCategory() {
        view.setViewPager(dataSource.getCategory());
    }
}