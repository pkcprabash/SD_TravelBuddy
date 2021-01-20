package com.example.page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView logos = findViewById(R.id.logos);
        logos.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        logos.setSelected(true);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat( "hh:mm:ss a");
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        String currentTime = simpleDateFormat.format(calendar.getTime());
        TextView textViewDate = findViewById(R.id.date);
        textViewDate.setText(currentDate);
        TextView textViewTime = findViewById(R.id.cTimes);
        textViewTime.setText(currentTime);

    }
}