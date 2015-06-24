package com.bevziuk.Weather;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;

import java.util.List;
import java.util.PriorityQueue;


public class HttpActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new HttpGetTask().execute();
    }

    private class HttpGetTask extends AsyncTask<Void, Void, List<String>> {

        private static final String URL = "http://api.openweathermap.org/data/2.5/forecast/daily?id=703448&mod=json&snt=7&unit=metric&lang=ua";

        private final Integer ID = 703448; //Kiev

        private final String MOD = "json";

        private final Integer DAY = 7; //7 days

        private final String METRIC = "metric";

        private final String LANG = "ua";

    }
}

