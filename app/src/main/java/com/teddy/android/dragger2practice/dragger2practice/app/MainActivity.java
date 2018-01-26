package com.teddy.android.dragger2practice.dragger2practice.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.teddy.android.dragger2practice.dragger2practice.R;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.CoffeeMaker;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Heater;
import com.teddy.android.dragger2practice.dragger2practice.coffeemaker.HeaterImp;
import com.teddy.android.dragger2practice.dragger2practice.common.coffeemaker.Pump;
import com.teddy.android.dragger2practice.dragger2practice.coffeemaker.PumpImp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeCoffee();
    }

    private void makeCoffee() {
        Heater heater = new HeaterImp();
        Pump pump = new PumpImp(heater);
        CoffeeMaker coffeeMaker = new CoffeeMaker(heater, pump);
        coffeeMaker.brew();
    }
}
