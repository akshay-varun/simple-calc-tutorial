package me.akshaygr.simplecalculator.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.akshaygr.simplecalculator.R;

public class MainActivity extends AppCompatActivity {
    private EditText Number1, Number2;
    private Button addBtn, subtractBtn, multiplyBtn, divisionBtn;

    String temp;
    float a, b, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1 = (EditText) findViewById(R.id.inputOne);
        Number2 = (EditText) findViewById(R.id.inputTwo);
        addBtn = (Button) findViewById(R.id.add);
        subtractBtn = (Button) findViewById(R.id.subtract);
        multiplyBtn = (Button) findViewById(R.id.multiply);
        divisionBtn = (Button) findViewById(R.id.division);

    }

    public void getResults(View btnClicked)
    {
        String op = "";
        temp = Number1.getText().toString();
        a = Float.parseFloat(temp);

        temp = Number2.getText().toString();
        b = Float.parseFloat(temp);


        switch (btnClicked.getId())
        {
            case R.id.add:
                op = "+";
                result = a + b;
                break;
            case R.id.subtract:
                op = "-";
                result = a - b;
                break;
            case R.id.multiply:
                op = "*";
                result = a * b;
                break;
            case R.id.division:
                op = "/";
                result = a / b;
                break;
        }

        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        String name;
        intent.putExtra("var1", String.valueOf(a)) ;
        intent.putExtra("var2", String.valueOf(b));
        intent.putExtra("op", op);
        intent.putExtra("result", String.valueOf(result));
        startActivity(intent);


    }
}
