package com.example.helloconstraint;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView countTextView;
    private Button buttonCount;
    private Button buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTextView = (TextView) findViewById(R.id.show_count);
        buttonZero = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void countUp(View view) {
        counter++;
        if(counter % 2 == 0) {
            view.setBackgroundColor(getColor(R.color.green));
        } else {
            view.setBackgroundColor(getColor(R.color.blue));
        }
        if (countTextView != null) countTextView.setText(Integer.toString(counter));
        buttonZero.setBackgroundColor(getColor(R.color.magenta));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n")
    public void resetCounter(View view){
        counter = 0;
        if (countTextView != null) countTextView.setText(Integer.toString(counter));
        view.setBackgroundColor(getColor(R.color.gray));
    }


}