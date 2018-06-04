package com.example.franciscoandrade.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Fragment PagerAdapter: Used if there is a limited number of pages
 * FragmentStatePagerAdapter: if number of pages cant be determine or large nnumber of pages
 */


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CollectionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= findViewById(R.id.pager);
        adapter= new CollectionAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


    }
}
