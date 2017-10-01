package com.fastship.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fastship.FragmentHistory;
import com.fastship.FragmentOrder;
import com.fastship.FragmentOrderFacebook;

/**
 * Created by DinhHop-PC on 10/1/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentOrder();
        } else if (position == 1) {
            return new FragmentOrderFacebook();
        } else return new FragmentHistory();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
