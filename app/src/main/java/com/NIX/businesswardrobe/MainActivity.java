package com.NIX.businesswardrobe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private float coat = 70;
    private int coatDiscount = 77;
    private float hat = 25;
    private int hatDiscount = 37;
    private float suit = 53;
    private int suitDiscount = 44;
    private float shirt = 19;
    private float shoes = 41;
    private int  shoesDiscount = 32;
    private float account = 312;

    private TextView possib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possib = findViewById(R.id.possibilityOut);

        if (possibility()) {
            possib.setText("Имеется достаточно средств");
        }
        else {
            possib.setText("Недостаточно средств");
        }
    }


    private float calculation() {
float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount)
        + suit * (100 - suitDiscount) + shoes * (100 - shoesDiscount)) / 100 +shirt;
return count;
    }

    private boolean possibility()  {
        if (calculation() <= account) {
            return true;
        }
        else {
            return false;
        }
    }


}