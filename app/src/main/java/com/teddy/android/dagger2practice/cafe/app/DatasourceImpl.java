package com.teddy.android.dagger2practice.cafe.app;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

class DatasourceImpl implements DataSource{

    private static final String[] CATEGORIES = {"SF","DRAMA"};
    private static final String[] DRAMA = {"Table 19","Fifty Shades Darker","Dunkirk","The Founder"};
    private static final String[] SF = {"Power Rangers","Wonder Woman","Spider-Man: Homecoming"
            ,"Transformers: The Last Knight","The Dark Tower"};

    @Inject
    public DatasourceImpl(){
    }

    @Override
    public List<String> getCategory() {
        return Arrays.asList(CATEGORIES);
    }

    @Override
    public List<String> getMovies(String category) {
        if(category.equals("SF")) {
            return Arrays.asList(SF);
        } else {
            return Arrays.asList(DRAMA);
        }
    }
}