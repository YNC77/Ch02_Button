package com.example.ync.ch02_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int size = 30;
    public void bigger(View v){
        TextView txv;
        txv = (TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);
    }
    public void smaller(View v){
        if(size>30) {
            TextView txv = (TextView) findViewById(R.id.txv);
            txv.setTextSize(--size);
        }
    }

    public void sayHello(View v) {
        EditText name = (EditText) findViewById(R.id.name);
        TextView txv = (TextView) findViewById(R.id.txv);
        String userName = name.getText().toString();
        txv.setText("Hello, " + userName + "!");
    }
}
