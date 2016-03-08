package com.rakesh_ap2016.hw3_rakeshne;

import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class CoverPageFragmentActivity extends Fragment {

    private static final String ARG_BUTTON_NUMBER = "button_number";


    public static CoverPageFragmentActivity newInstance(int buttonNumber) {
        CoverPageFragmentActivity buttonsFragment = new CoverPageFragmentActivity();
        Bundle args = new Bundle();
        args.putInt(ARG_BUTTON_NUMBER, buttonNumber);
        buttonsFragment.setArguments(args);
        return buttonsFragment;
    }

    public CoverPageFragmentActivity() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_coverpage, container, false);
        final HandleNavigationListener handleNavigationListener;
        try{
            handleNavigationListener = (HandleNavigationListener)rootView.getContext();
        }catch(ClassCastException e){
                throw new ClassCastException("Hosting activity of the fragment forget to implement OnFragmentInteractionListener");
        }


        Button aboutMeButton = (Button) rootView.findViewById(R.id.aboutMeButton);

        Button task1Button = (Button) rootView.findViewById(R.id.task1Button);

        Button task2Button = (Button) rootView.findViewById(R.id.task2Button);

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               handleNavigationListener.navigateToItemSelected(R.id.aboutMeButton);
            }
        });

        task1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.task1Button);
            }
        });

        task2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNavigationListener.navigateToItemSelected(R.id.task2Button);
            }
        });
      /*  switch(option){
            case R.id.aboutMeButton:
                break;
            case R.id.task1Button:
                rootView = null;
                break;
            case R.id.task2Button:
                rootView = null;
                break;
        }*/
        return rootView;
    }
}
