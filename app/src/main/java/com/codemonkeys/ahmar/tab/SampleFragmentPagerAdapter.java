package com.codemonkeys.ahmar.tab;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentPagerAdapter;
import com.codemonkeys.ahmar.tab.Tab2;
import com.codemonkeys.ahmar.tab.Tab3;
import android.widget.Switch;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"Tab1", "Tab2", "Tab3"};
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Tab2 mtab2;
        Tab3 mtab3;
        switch (position){

            case 0:
                Tab1Main mtab1=new Tab1Main();
                return mtab1;
            case 1:

                mtab2 = new Tab2();
                return mtab2;
            case 2:

                mtab3 = new Tab3();
                return mtab3;
        }
        return PageFragment.newInstance(position + 1);

    }
        @Override
        public CharSequence getPageTitle ( int position){
            // Generate title based on item position
            return tabTitles[position];
        }
    }
