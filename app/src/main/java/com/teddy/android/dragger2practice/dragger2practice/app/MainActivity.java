package com.teddy.android.dragger2practice.dragger2practice.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.teddy.android.dragger2practice.dragger2practice.R;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dragger2practice.dragger2practice.di.DaggerCoffeeMakerComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeCoffee();
    }

    private void makeCoffee() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DaggerCoffeeMakerComponent.create().inject(coffeeMaker);
        coffeeMaker.brew();
    }
}
