package com.teddy.android.dagger2practice.cafe.interactor.usecase;

import com.teddy.android.dagger2practice.cafe.interactor.model.DataSource;

import javax.inject.Inject;

public class GetMenu implements UseCase<String> {

    private final DataSource mDataSource;

    @Inject
    GetMenu(DataSource dataSource) {
        mDataSource = dataSource;

    }

    @Override
    public void excute(Observer observer, String category) {
        observer.onUpdate(mDataSource.getMenuItem(category));
    }
}
