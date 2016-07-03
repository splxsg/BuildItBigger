package com.Blues.myapplication.backend;


import com.example.JokeProvider;

/** The object model for the data we are sending through endpoints */
public class MyBean {


    private String myData;

    public String getData() {return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String getJoke()
    {
        JokeProvider jokeProvider = new JokeProvider();
        return jokeProvider.getJoke();
    }
}