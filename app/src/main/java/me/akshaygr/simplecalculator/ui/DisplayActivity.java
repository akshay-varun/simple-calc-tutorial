package me.akshaygr.simplecalculator.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import me.akshaygr.simplecalculator.R;

public class DisplayActivity extends AppCompatActivity
{
     TextView answerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        answerView = findViewById(R.id.result);

        Intent i = getIntent();
        String num1 = i.getStringExtra("var1");
        String num2 = i.getStringExtra("var2");
        String operator = i.getStringExtra("op");
        String  ans = i.getStringExtra("result");

        String res = num1 + " " + operator + " "+  num2 + " = " + ans;

        answerView.setText(res);
    }
}
