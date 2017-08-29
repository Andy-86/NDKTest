package com.example.andy.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.Mytext);
        textView.setText(getString());
    }
    static {
        System.loadLibrary("lavor");
    }
    public native String getString();
}
