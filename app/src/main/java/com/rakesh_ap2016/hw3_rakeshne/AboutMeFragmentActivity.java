package com.rakesh_ap2016.hw3_rakeshne;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutMeFragmentActivity extends Fragment {

    private static final String ARG_BUTTON_NUMBER = "button_number";

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public static AboutMeFragmentActivity newInstance(int buttonNumber){
        AboutMeFragmentActivity aboutMeFragmentActivityFragment =  new AboutMeFragmentActivity();
        Bundle args = new Bundle();
        args.putInt(ARG_BUTTON_NUMBER,buttonNumber);
        aboutMeFragmentActivityFragment.setArguments(args);
        return aboutMeFragmentActivityFragment;
    }
    public AboutMeFragmentActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_me, container, false);
    }

}
