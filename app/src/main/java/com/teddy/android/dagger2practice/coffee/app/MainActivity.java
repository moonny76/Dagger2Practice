package com.teddy.android.dagger2practice.coffee.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.teddy.android.dagger2practice.coffee.R;
import com.teddy.android.dagger2practice.coffee.common.coffeemaker.CoffeeBean;
import com.teddy.android.dagger2practice.coffee.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dagger2practice.coffee.di.CafeComponent;
import com.teddy.android.dagger2practice.coffee.di.CafeModule;
import com.teddy.android.dagger2practice.coffee.di.CoffeeMakerComponent;
import com.teddy.android.dagger2practice.coffee.di.DaggerCafeComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeCoffee();
    }

    private void makeCoffee() {
        CafeComponent cafeComponent = DaggerCafeComponent.builder()
                .cafeModule(new CafeModule("test"))
                .build();
        cafeComponent.cafeInfo().welcome();
        CoffeeMakerComponent coffeeMakerComponent = cafeComponent.coffeeMakerComponent().build();
        CoffeeMaker coffeeMaker = coffeeMakerComponent.coffeeMaker();
        CoffeeBean coffeeBean = coffeeMakerComponent.coffeebean();
        coffeeBean.name();
        coffeeMaker.brew(coffeeBean);
        coffeeMakerComponent.coffeeBeanMap().get("guatemala").name();
    }
}
