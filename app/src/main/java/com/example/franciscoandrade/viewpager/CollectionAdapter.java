package com.example.franciscoandrade.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CollectionAdapter extends FragmentStatePagerAdapter {


    public CollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//        RedFragment redFragment = new RedFragment();
//        Bundle bundle= new Bundle();
//        position=position+1;
//        bundle.putString("message", "Heelo from page :"+position);
//        redFragment.setArguments(bundle);


        switch (position){
            case 0:
                    return new RedFragment().newInstance("RedFragment, Instance 1");

            case 1:
                return new BlueFragment().newInstance("BlueFragment, Instance 1");

            case 2:

                return new RedFragment().newInstance("RedFragment, Instance 2");

            default:
                return new BlueFragment().newInstance("BlueFragment, Instance 2");



        }


    }

    @Override
    public int getCount() {
        return 4;
    }
}
