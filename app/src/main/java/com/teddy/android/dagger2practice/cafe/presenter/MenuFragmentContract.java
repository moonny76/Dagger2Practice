package com.teddy.android.dagger2practice.cafe.presenter;

import java.util.List;

public class MenuFragmentContract {

    public interface View{
        void setList(List<String> categories);
    }
    public interface Presenter{
        void loadMenu(String category);
    }
}
