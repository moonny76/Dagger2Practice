package com.teddy.android.dagger2practice.cafe.app;

import java.util.List;

interface DataSource {
    List<String> getCategory();

    List<String> getMovies(String category);
}
