package com.example.myspinnerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String [] country_name;
    private int [] flags = {R.drawable.afgan_flag,R.drawable.bangladesh_flag,
            R.drawable.bhuta_flag,R.drawable.chinaflag_here,R.drawable.germany_flag,
            R.drawable.india_flag,R.drawable.meyanmar_flag,R.drawable.nepal_flag,
            R.drawable.pakflag_flag,R.drawable.russia_flag};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinnerId);
        country_name = getResources().getStringArray(R.array.country_list);
        CoustomAdapter coustomAdapter = new CoustomAdapter(getApplicationContext(),country_name,flags);
        spinner.setAdapter(coustomAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),country_name[i]+"The Country Name",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}