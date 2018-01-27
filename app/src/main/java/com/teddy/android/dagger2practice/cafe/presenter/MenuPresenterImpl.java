package com.teddy.android.dagger2practice.cafe.presenter;

import com.teddy.android.dagger2practice.cafe.interactor.model.DataSource;
import com.teddy.android.dagger2practice.cafe.interactor.usecase.GetMenu;
import com.teddy.android.dagger2practice.cafe.interactor.usecase.UseCase;

import java.util.List;

import javax.inject.Inject;

public class MenuPresenterImpl implements MenuFragmentContract.Presenter{
    private MenuFragmentContract.View mView;
    private UseCase mUseCase;

    @Inject
    public MenuPresenterImpl(MenuFragmentContract.View view, GetMenu useCase) {
        mView = view;
        mUseCase = useCase;
    }

    @Override
    public void loadMenu(String category) {
        mUseCase.excute(new UseCase.Observer<List<String>>() {
            @Override
            public void onUpdate(List<String> value) {
                mView.setList(value);
            }
        }, category);
    }
}
