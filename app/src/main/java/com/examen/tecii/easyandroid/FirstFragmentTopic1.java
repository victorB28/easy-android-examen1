package com.examen.tecii.easyandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragmentTopic1 extends Fragment {

    public FirstFragmentTopic1() {
        // Required empty public constructor
    }

    public static FirstFragmentTopic1 newInstance() {
        FirstFragmentTopic1 fragment = new FirstFragmentTopic1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_fragment_topic1, container, false);
    }

}
