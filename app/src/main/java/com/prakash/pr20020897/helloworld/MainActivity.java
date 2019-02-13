package com.prakash.pr20020897.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView display;
    EditText first, second;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display = findViewById(R.id.username_display);
        first = findViewById(R.id.first_number);
        second = findViewById(R.id.second_number);
        add = findViewById(R.id.add_btn);
        sub = findViewById(R.id.sub_btn);
        mul = findViewById(R.id.mul_btn);
        div = findViewById(R.id.div_btn);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(!first.getText().toString().equals("") && !second.getText().toString().equals("")) {
            switch (id) {
                case R.id.add_btn:
                    display.setText(String.valueOf(Integer.valueOf(first.getText().toString()) + Integer.valueOf(second.getText().toString())));
                    break;
                case R.id.sub_btn:
                    display.setText(String.valueOf(Integer.valueOf(first.getText().toString()) - Integer.valueOf(second.getText().toString())));
                    break;
                case R.id.mul_btn:
                    display.setText(String.valueOf(Integer.valueOf(first.getText().toString()) * Integer.valueOf(second.getText().toString())));
                    break;
                case R.id.div_btn:
                    if (Integer.valueOf(second.getText().toString()) != 0)
                        display.setText(String.valueOf(Integer.valueOf(first.getText().toString()) / Integer.valueOf(second.getText().toString())));
                    else Toast.makeText(this, "Cannot divide by zero.", Toast.LENGTH_SHORT).show();;
                    break;
            }
        }
        else {
            Toast.makeText(this, "Try some input", Toast.LENGTH_SHORT).show();
        }
    }
}
