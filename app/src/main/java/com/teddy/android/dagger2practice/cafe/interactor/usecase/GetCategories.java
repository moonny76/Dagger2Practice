package com.teddy.android.dagger2practice.cafe.interactor.usecase;

import com.teddy.android.dagger2practice.cafe.interactor.model.DataSource;

import javax.inject.Inject;

public class GetCategories implements UseCase {

    private final DataSource mDataSource;

    @Inject
    GetCategories(DataSource dataSource) {
        mDataSource = dataSource;

    }

    @Override
    public void excute(Observer observer, Object param) {
        observer.onUpdate(mDataSource.getCategory());
    }
}
