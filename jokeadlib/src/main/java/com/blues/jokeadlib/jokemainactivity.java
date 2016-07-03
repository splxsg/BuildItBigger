package com.blues.jokeadlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.JokeProvider;

/**
 * Created by Blues on 03/07/2016.
 */
public class jokemainactivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_joke);
        getSupportFragmentManager().beginTransaction().add(R.id.id_joke_main, new jokefragment()).commit();
    }



}
