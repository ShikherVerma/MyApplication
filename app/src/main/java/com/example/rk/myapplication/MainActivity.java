package com.example.rk.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText editText1;
    EditText editText2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);
    }

    void calculate(View v) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();
        result.setText(s1 + s2);
    }
}
