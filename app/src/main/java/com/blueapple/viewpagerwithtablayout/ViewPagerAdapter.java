package com.blueapple.viewpagerwithtablayout;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.blueapple.viewpagerwithtablayout.fragment.FirstFragment;
import com.blueapple.viewpagerwithtablayout.fragment.SecondFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter
{

    int no_ofTabs;


    public ViewPagerAdapter(@NonNull FragmentManager fm, int no_ofTabs)
    {
        super(fm);
        this.no_ofTabs = no_ofTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                FirstFragment firstFragment=new FirstFragment();
                return firstFragment;

            case 1:
                SecondFragment secondFragment=new SecondFragment();
                return secondFragment;

                default:
                    return null;
        }


    }

    @Override
    public int getCount() {
        return no_ofTabs;
    }
}
