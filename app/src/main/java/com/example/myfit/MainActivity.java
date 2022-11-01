package com.example.myfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRvFitness;
    FitnessDataAdapter mAdapter;
    ArrayList<FitnessData> mFitnessList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRvFitness = (RecyclerView) findViewById(R.id.rv_fitness);

        // Create adapter b/w data and listview
        mAdapter = new FitnessDataAdapter();
        mRvFitness.setAdapter(mAdapter);
        mRvFitness.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        // Add some dummies to list only for test
        mFitnessList = new ArrayList<FitnessData>();
        mFitnessList.add(new FitnessData("Sat 01 Oct 2022", FitnessType.Walk, 20));
        mFitnessList.add(new FitnessData("Wen 05 Oct 2022", FitnessType.Run, 45));
        mFitnessList.add(new FitnessData("Fri 14 Oct 2022", FitnessType.Walk, 45));
        mFitnessList.add(new FitnessData("Sat 22 Oct 2022", FitnessType.Bicycle, 30));
        mFitnessList.add(new FitnessData("Fri 28 Oct 2022", FitnessType.Bicycle, 60));
        mFitnessList.add(new FitnessData("Sat 05 Nov 2022", FitnessType.Run,  25));
        mFitnessList.add(new FitnessData("Sun 06 Oct 2022", FitnessType.Bicycle, 60));
        mFitnessList.add(new FitnessData("Mon 07 Nov 2022", FitnessType.Run,  25));

        mAdapter.setDummyList(mFitnessList);
    }
}