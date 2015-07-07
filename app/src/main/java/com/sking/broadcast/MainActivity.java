package com.sking.broadcast;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    private   MyReceiver myReceiver = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = (Button) findViewById(R.id.send);
        Button re =(Button) findViewById(R.id.re);
        Button unre = (Button) findViewById(R.id.unre);

        send.setOnClickListener(this);
        re.setOnClickListener(this);
        unre.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.send:
//                Intent intent = new Intent(this,MyReceiver.class);
//                sendBroadcast(intent);
                sendBroadcast(new Intent(MyReceiver.ACTION));
                break;
            case R.id.re:

                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(MyReceiver.ACTION);
                if(myReceiver==null)
                    myReceiver = new MyReceiver();
                registerReceiver(myReceiver,intentFilter);
                break;
            case R.id.unre:
                if(myReceiver!=null) {

                    unregisterReceiver(myReceiver);
                    myReceiver = null;
                }
        }
    }
}
