package com.rakesh_ap2016.hw3_rakeshne;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class MasterFlowFragmentActivity extends Fragment {

    private static final String ARG_BUTTON_NUMBER = "button_number";
    public MasterFlowFragmentActivity() {
        // Required empty public constructor
    }
    public static MasterFlowFragmentActivity newInstance(int buttonNumber) {
        // Required empty public constructor
        MasterFlowFragmentActivity masterFlowFragmentActivity = new MasterFlowFragmentActivity();
        Bundle args = new Bundle();
        args.putInt(ARG_BUTTON_NUMBER, buttonNumber);
        masterFlowFragmentActivity.setArguments(args);
        return masterFlowFragmentActivity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_master_flow, container, false);
        final HandleNavigationListener handleNavigationListener;
        try{
            handleNavigationListener = (HandleNavigationListener)rootView.getContext();
        }catch(ClassCastException e){
            throw new ClassCastException("Hosting activity of the fragment forget to implement OnFragmentInteractionListener");
        }
        Button button1=(Button)rootView.findViewById(R.id.movie1Button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.movie1Button);
            }
        });

        Button button2=(Button)rootView.findViewById(R.id.movie2Button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.movie2Button);
            }
        });

        Button button3=(Button)rootView.findViewById(R.id.movie3Button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.movie3Button);
            }
        });

        Button button4=(Button)rootView.findViewById(R.id.movie4Button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.movie4Button);
            }
        });

        Button button5=(Button)rootView.findViewById(R.id.movie5Button);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.movie5Button);
            }
        });
        return rootView;
    }

}
