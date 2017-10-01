package com.fastship;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fastship.adapters.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DinhHop-PC on 9/14/2017.
 */

public class HomeFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
//    private FragmentShop fragmentShop = new FragmentShop();
//    FragmentOrder fragmentOrder = new FragmentOrder();
//    FragmentHistory fragmentHistory = new FragmentHistory();
    private Toolbar toolbar;
    public HomeFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_home, container, false);
        getActivity().setTitle("Danh sách đơn hàng");
        viewPager = (ViewPager) inflatedView.findViewById(R.id.viewpager);
        tabLayout = (TabLayout) inflatedView.findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Đơn mới"));
        tabLayout.addTab(tabLayout.newTab().setText("Đơn facebook"));
        tabLayout.addTab(tabLayout.newTab().setText("Đơn đã nhận"));
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabLayout.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return inflatedView;
    }
}
