package com.example.pc.viewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pc.viewpager.Controllers.Fragments.PageFragment;

/**
 * Created by pc on 22/03/2018.
 */

public class PageAdapter extends FragmentPagerAdapter {


    private int[] colors;


    public PageAdapter(FragmentManager mgr, int[] colors) {
        super(mgr);
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return(5);
    }

    @Override
    public Fragment getItem(int position) {

        return(PageFragment.newInstance(position, this.colors[position]));
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page "+position;
    }
}
