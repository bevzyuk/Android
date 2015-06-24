package com.bevziuk.Weather;

import android.app.ListActivity;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.os.Bundle;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


public class HttpActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new HttpGetTask().execute();
    }

    private class HttpGetTask extends AsyncTask<Void, Void, List<String>> {

        private final Integer ID = 703448; //Kiev
        private final String MOD = "json";
        private final Integer DAY = 7; //7 days
        private final String METRIC = "metric";
        private final String LANG = "ua";
        private  final String URL = "http://api.openweathermap.org/data/2.5/forecast/daily?id="
                +ID+"&mod="+MOD+"&snt="+DAY+"&unit="+METRIC+"&lang="+LANG;

        AndroidHttpClient mClient = AndroidHttpClient.newInstance("");

        @Override
        protected List<String> doInBackground(Void... params) {

            HttpGet request = new HttpGet(URL);
/*
            try {
                mClient.execute();
            } catch (IOException e) {

            }

*/

          //  JSONResponseHandler responseHandler = new JSONResponseHandler();
            return null;
        }
    }
}

