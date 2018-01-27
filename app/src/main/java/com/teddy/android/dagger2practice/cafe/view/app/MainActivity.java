package com.teddy.android.dagger2practice.cafe.view.app;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.teddy.android.dagger2practice.cafe.R;
import com.teddy.android.dagger2practice.cafe.presenter.MainActivityContract;
import com.teddy.android.dagger2practice.cafe.view.utils.Logger;

import java.util.List;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector, MainActivityContract.View{

    private static final String TAG = "MainActivity";
    @Inject
    MainActivityContract.Presenter mPresenter;

    @Inject
    DispatchingAndroidInjector<Fragment> mDispatchingAndroidInjector;

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);

        mViewPager = findViewById(R.id.pager);
        mTabLayout = findViewById(R.id.tab);

        mPresenter.loadCategory();
    }

    @Override
    public void setViewPager(List<String> categories) {
        for (String item: categories) {
            Logger.e(TAG, "item : " + item);
        }
        mViewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), categories));
        mTabLayout.setupWithViewPager(mViewPager);
    }



    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return mDispatchingAndroidInjector;
    }

    private class PageAdapter extends FragmentPagerAdapter {

        private List<String> mCategories;

        public PageAdapter(FragmentManager fragmentManager, List<String> categories) {
            super(fragmentManager);
            mCategories = categories;
        }

        @Override
        public Fragment getItem(int position) {
            return MenuFragment.newInstance(mCategories.get(position));
        }

        @Override
        public int getCount() {
            return mCategories.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mCategories.get(position);
        }
    }
}
