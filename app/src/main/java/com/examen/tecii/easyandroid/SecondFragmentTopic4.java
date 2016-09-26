package com.examen.tecii.easyandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFragmentTopic4 extends Fragment {

    public SecondFragmentTopic4() {
        // Required empty public constructor
    }

    public static SecondFragmentTopic4 newInstance() {
        SecondFragmentTopic4 fragment = new SecondFragmentTopic4();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_fragment_topic4, container, false);
    }
}