package com.rakesh_ap2016.hw3_rakeshne;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Locale;

/**
 * Created by rakeshh91 on 2/10/2016.
 */
public class MovieFragmentPagerAdapater extends FragmentPagerAdapter{

    int count;
    MovieData movieData;
    public MovieFragmentPagerAdapater(FragmentManager fm,int size){
        super(fm);
        count = size;
        movieData = new MovieData();
    }

    @Override
    public Fragment getItem(int position) {
        return Movie_Fragement_ViewPager.newInstance((HashMap<String,?>)movieData.getItem(position));
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        HashMap<String,?> movie = (HashMap<String,?>)movieData.getItem(position);
        String name = (String)movie.get("name");
        return name.toUpperCase(l);
    }
}
