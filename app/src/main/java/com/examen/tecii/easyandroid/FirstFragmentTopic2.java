package com.examen.tecii.easyandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragmentTopic2 extends Fragment {

    public FirstFragmentTopic2() {
        // Required empty public constructor
    }

    public static FirstFragmentTopic2 newInstance() {
        FirstFragmentTopic2 fragment = new FirstFragmentTopic2();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_fragment_topic2, container, false);
    }

}
