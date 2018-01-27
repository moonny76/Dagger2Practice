package com.teddy.android.dagger2practice.cafe.app;

import java.util.List;

public interface MainActivityContract {

    interface Presenter {
        void loadCategory();
    }

    interface  View {
        void setViewPager(List<String> category);
    }
}
