package com.example.artem.personscontrol.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.artem.personscontrol.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {


//    public static SettingsFragment sharedInstance() { return new SettingsFragment(); }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

}
