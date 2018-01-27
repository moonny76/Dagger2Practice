package com.teddy.android.dagger2practice.cafe.model;

import com.teddy.android.dagger2practice.cafe.interactor.model.DataSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class DatasourceImpl implements DataSource {

    private static final String[] CATEGORIES = {"COFFEE", "BEVERAGE", "FLATCCINO"};
    private static final String[] COFFEE = {"카페 아메리카노", "카페 라떼", "카푸치노"
            , "카페 모카", "카라멜 마끼야또"};
    private static final String[] BEVERAGE = {"아이스티", "녹차 라데", "캐모마일"
            , "로즈마리"};
    private static final String[] FLATCCINO = {"망고 플랫치노"," 자몽 플랫치노","녹차 플랫치노"
            ,"요거트 플랫치노"};

    @Inject
    DatasourceImpl(){
    }

    @Override
    public List<String> getCategory() {
        return Arrays.asList(CATEGORIES);
    }

    @Override
    public List<String> getMenuItem(String category) {
        switch (category) {
            case "COFFEE":
                return Arrays.asList(COFFEE);
            case "BEVERAGE":
                return Arrays.asList(BEVERAGE);
            case "FLATCCINO":
                return Arrays.asList(FLATCCINO);
            default:
                return Collections.emptyList();
        }
    }
}