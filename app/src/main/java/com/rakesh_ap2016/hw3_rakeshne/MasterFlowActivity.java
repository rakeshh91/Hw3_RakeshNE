package com.rakesh_ap2016.hw3_rakeshne;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

public class MasterFlowActivity extends AppCompatActivity implements HandleNavigationListener {

    private boolean mTwoPane;
    MovieData mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_flow);
        setTitle("Movies master/detail");
        mData = new MovieData();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.phoneContainer,MasterFlowFragmentActivity.newInstance(R.id.task3ButtonsLayout))
                .commit();
       /* if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.phoneContainer, MasterFlowFragmentActivity.newInstance(R.id.task3ButtonsLayout));
        }*/

        if (findViewById(R.id.tabletContainer) != null) {
            mTwoPane = true;
        }
    }


    @Override
    public void navigateToItemSelected(int buttonId) {
        if(buttonId==R.id.movie1Button){
            if (mTwoPane) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.tabletContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(0)))
                        .commit();

            } else {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.phoneContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(0)))
                        .addToBackStack("Stored")
                        .commit();
            }
        }
        if(buttonId==R.id.movie2Button){

            if (mTwoPane) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.tabletContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(1)))
                        .commit();

            } else {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.phoneContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(1)))
                        .addToBackStack("Stored")
                        .commit();
            }
        }
        if(buttonId==R.id.movie3Button){
            if (mTwoPane) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.tabletContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(2)))
                        .commit();

            } else {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.phoneContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(2)))
                        .addToBackStack("Stored")
                        .commit();
            }
        }
        if(buttonId==R.id.movie4Button){
            if (mTwoPane) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.tabletContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(3)))
                        .commit();

            } else {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.phoneContainer,Movie_Fragement_ViewPager.newInstance(mData.getItem(3)))
                        .addToBackStack("Stored")
                        .commit();
            }
        }
        if(buttonId==R.id.movie5Button){
            if (mTwoPane) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.tabletContainer, Movie_Fragement_ViewPager.newInstance(mData.getItem(4)))
                        .commit();

            } else {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.phoneContainer,Movie_Fragement_ViewPager.newInstance(mData.getItem(4)))
                        .addToBackStack("Stored")
                        .commit();
            }
        }
    }
}
