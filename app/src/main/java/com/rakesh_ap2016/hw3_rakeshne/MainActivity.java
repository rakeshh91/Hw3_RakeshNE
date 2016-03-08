package com.rakesh_ap2016.hw3_rakeshne;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
        implements HandleNavigationListener {

    Fragment mContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container_frame);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        if(savedInstanceState!=null){
            mContent = getSupportFragmentManager().getFragment(savedInstanceState,"mContent");
        }
        else{
            mContent = CoverPageFragmentActivity.newInstance(R.id.fragmentButtons);
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, mContent)
                .commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getSupportFragmentManager().putFragment(outState,"mContent",mContent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void navigateToItemSelected(int buttonId) {
            if (buttonId == R.id.aboutMeButton) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment, AboutMeFragmentActivity.newInstance(R.id.fragmentAboutMe))
                        .addToBackStack("store")
                        .commit();
                setTitle("About Me");
            }
            if (buttonId == R.id.task1Button) {
                Intent i = new Intent(this, ViewPagerActivity.class);
                startActivity(i);
            }
            if (buttonId == R.id.task2Button) {
                Intent i = new Intent(this,MasterFlowActivity.class);
                startActivity(i);
            }
    }

}
