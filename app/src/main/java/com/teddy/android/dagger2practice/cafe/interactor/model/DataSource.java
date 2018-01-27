package com.teddy.android.dagger2practice.cafe.interactor.model;

import java.util.List;

public interface DataSource {
    List<String> getCategory();

    List<String> getMenuItem(String category);
}
