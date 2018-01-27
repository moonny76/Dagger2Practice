package com.teddy.android.dagger2practice.cafe.app;

import java.util.List;

public class MovieFragmentContract {

    interface View{
        void setList(List<String> categories);
    }
    interface Presenter{
        void loadMovies(String category);
    }
}
