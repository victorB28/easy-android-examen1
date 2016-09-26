package com.examen.tecii.easyandroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFragmentTopic3 extends Fragment {

    public SecondFragmentTopic3() {
        // Required empty public constructor
    }

    public static SecondFragmentTopic3 newInstance() {
        SecondFragmentTopic3 fragment = new SecondFragmentTopic3();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_fragment_topic3, container, false);
    }
}