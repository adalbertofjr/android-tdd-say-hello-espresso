package com.adalbertofjr.sayhelloespresso;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button mButtonSayHello;
    private EditText mName;
    private TextView mMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMsg = (TextView) findViewById(R.id.txvHello);
        mName = (EditText) findViewById(R.id.txtName);
        mButtonSayHello = (Button) findViewById(R.id.btnSayHello);


        mButtonSayHello.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnSayHello){
           mMsg.setText("Hello, " + mName.getText() + "!");
        }

    }
}
