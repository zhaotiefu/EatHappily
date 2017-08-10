package com.personal.zhaotf.eathappily;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView  mBeChosen;
    private TextView  mWantEat;
    private TextView  mSetout;
    private TextView  mClicMe;
    private Resources res;
    private String[] mHotelSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWantEat = findViewById(R.id.beChosen);
        mSetout = findViewById(R.id.wantEat);
        mClicMe = findViewById(R.id.click_me);
        mClicMe.setOnClickListener(this);
        res = getResources();
        mHotelSize = res.getStringArray(R.array.hotel_list);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.click_me:
                chooseRestaurant();
                break;
        }
    }

    private void chooseRestaurant() {
        int number = new Random().nextInt(11);
        mWantEat.setText(" " + mHotelSize[number] + " ");
    }
}
