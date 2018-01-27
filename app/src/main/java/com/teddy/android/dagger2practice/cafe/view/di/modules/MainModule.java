package com.teddy.android.dagger2practice.cafe.view.di.modules;

import android.support.v4.app.Fragment;

import com.teddy.android.dagger2practice.cafe.interactor.usecase.GetCategories;
import com.teddy.android.dagger2practice.cafe.interactor.usecase.GetMenu;
import com.teddy.android.dagger2practice.cafe.interactor.usecase.UseCase;
import com.teddy.android.dagger2practice.cafe.presenter.MainPresenterImpl;
import com.teddy.android.dagger2practice.cafe.view.app.MainActivity;
import com.teddy.android.dagger2practice.cafe.presenter.MainActivityContract;
import com.teddy.android.dagger2practice.cafe.view.app.MenuFragment;
import com.teddy.android.dagger2practice.cafe.view.di.ActivityScope;
import com.teddy.android.dagger2practice.cafe.view.di.components.MenuFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MenuFragmentComponent.class)
public abstract class MainModule {

    @ActivityScope
    @Binds
    abstract MainActivityContract.View bindView(MainActivity activity);

    @ActivityScope
    @Binds
    abstract MainActivityContract.Presenter bindPresenter(MainPresenterImpl mainPresenter);

    @Binds
    @IntoMap
    @FragmentKey(MenuFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMenuFragment(MenuFragmentComponent.Builder builder);
}
