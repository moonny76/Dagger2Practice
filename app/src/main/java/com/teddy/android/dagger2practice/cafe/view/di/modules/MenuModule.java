package com.teddy.android.dagger2practice.cafe.view.di.modules;

import com.teddy.android.dagger2practice.cafe.interactor.usecase.GetMenu;
import com.teddy.android.dagger2practice.cafe.interactor.usecase.UseCase;
import com.teddy.android.dagger2practice.cafe.view.app.MenuFragment;
import com.teddy.android.dagger2practice.cafe.presenter.MenuFragmentContract;
import com.teddy.android.dagger2practice.cafe.presenter.MenuPresenterImpl;
import com.teddy.android.dagger2practice.cafe.view.di.ActivityScope;
import com.teddy.android.dagger2practice.cafe.view.di.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;

@Module
public abstract class MenuModule {

    @FragmentScope
    @Binds
    abstract MenuFragmentContract.Presenter bindPresenter(MenuPresenterImpl menuPresenter);

    @FragmentScope
    @Binds
    abstract MenuFragmentContract.View bindView(MenuFragment menuFragment);

}
