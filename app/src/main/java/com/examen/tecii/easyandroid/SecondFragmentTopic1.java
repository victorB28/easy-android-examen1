package com.examen.tecii.easyandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragmentTopic1 extends Fragment {

    public SecondFragmentTopic1() {
        // Required empty public constructor
    }

    public static SecondFragmentTopic1 newInstance() {
        SecondFragmentTopic1 fragment = new SecondFragmentTopic1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_fragment_topic1, container, false);
    }

}
