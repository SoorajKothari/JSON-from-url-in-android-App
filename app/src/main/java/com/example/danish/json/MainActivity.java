package com.example.danish.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    public  static TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
         data = (TextView)findViewById(R.id.txthere);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            FetchData process = new FetchData();
            process.execute();
            }
        });
    }
}
