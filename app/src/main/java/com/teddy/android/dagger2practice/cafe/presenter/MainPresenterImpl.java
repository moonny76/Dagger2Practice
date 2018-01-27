package com.teddy.android.dagger2practice.cafe.presenter;

import com.teddy.android.dagger2practice.cafe.interactor.usecase.GetCategories;
import com.teddy.android.dagger2practice.cafe.interactor.usecase.UseCase;

import java.util.List;

import javax.inject.Inject;

public class MainPresenterImpl implements MainActivityContract.Presenter {

    MainActivityContract.View mView;
    UseCase mUseCase;

    @Inject
    public MainPresenterImpl(MainActivityContract.View view, GetCategories useCase){
        mView = view;
        mUseCase = useCase;
    }

    @Override
    public void loadCategory() {
        mUseCase.excute(new UseCase.Observer<List<String>>() {
            @Override
            public void onUpdate(List<String> value) {
                mView.setViewPager(value);
            }
        }, null);
    }
}