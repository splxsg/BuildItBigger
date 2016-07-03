package com.blues.jokeadlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.JokeProvider;

/**
 * Created by Blues on 03/07/2016.
 */
public class jokefragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View rootview = inflater.inflate(R.layout.frag_joke, container, false);
       Intent myIntent = getActivity().getIntent();
        if(myIntent != null && myIntent.hasExtra(Intent.EXTRA_TEXT)){
            ((TextView) rootview.findViewById(R.id.joketext)).setText(myIntent.getStringExtra(Intent.EXTRA_TEXT));
        }

        return rootview;
    }

}
