package com.dcw.percentpiechart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PieView mPieView;
    private ArrayList<PieData> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPieView = (PieView) findViewById(R.id.pieView);
        mDatas.add(new PieData("你好", 90));
        mDatas.add(new PieData("你好1", 80));
        mDatas.add(new PieData("你好2", 10));
        mDatas.add(new PieData("你好3", 70));

        mPieView.setStartAngle(0);
        mPieView.setData(mDatas);
    }
}
