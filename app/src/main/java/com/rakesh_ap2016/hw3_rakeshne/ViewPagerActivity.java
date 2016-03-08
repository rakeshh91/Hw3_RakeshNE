package com.rakesh_ap2016.hw3_rakeshne;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class ViewPagerActivity extends AppCompatActivity {


    MovieData movieData;
    ViewPager viewPager;
    MovieFragmentPagerAdapater movieFragmentPagerAdapater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        movieData = new MovieData();
        movieFragmentPagerAdapater=new MovieFragmentPagerAdapater(getSupportFragmentManager(),movieData.getSize());
        viewPager = (ViewPager)findViewById(R.id.viewPagerContainer);
        viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View page, float position) {
                    final float normalized_position =Math.abs(Math.abs(position)-1);
               // page.setScaleX(normalized_position / 2 + 0.5f);
               // page.setScaleY(normalized_position/2+0.5f);


              //page.setAlpha(normalized_position);
                page.setRotationY(position*-30);
                page.setTranslationX(page.getWidth() * -position);

                if(position <= -1.0F || position >= 1.0F) {
                    page.setAlpha(0.0F);
                } else if( position == 0.0F ) {
                    page.setAlpha(1.0F);
                } else {
                    // position is between -1.0F & 0.0F OR 0.0F & 1.0F
                    page.setAlpha(1.0F - Math.abs(position));
                }
            }
        });
        viewPager.setAdapter(movieFragmentPagerAdapater);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }
}
