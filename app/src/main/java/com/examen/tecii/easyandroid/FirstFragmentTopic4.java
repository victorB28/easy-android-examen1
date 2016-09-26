package com.examen.tecii.easyandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragmentTopic4 extends Fragment {

    public FirstFragmentTopic4() {

    }

    public static FirstFragmentTopic4 newInstance() {
        FirstFragmentTopic4 fragment = new FirstFragmentTopic4();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_fragment_topic4, container, false);
    }

    }