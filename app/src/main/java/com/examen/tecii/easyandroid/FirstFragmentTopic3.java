package com.examen.tecii.easyandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragmentTopic3 extends Fragment {

    public FirstFragmentTopic3() {
        // Required empty public constructor
    }

    public static FirstFragmentTopic3 newInstance() {
        FirstFragmentTopic3 fragment = new FirstFragmentTopic3();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_fragment_topic3, container, false);
    }
}
