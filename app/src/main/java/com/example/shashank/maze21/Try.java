package com.example.shashank.maze21;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Try extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in=getIntent();
        Bundle extras=in.getExtras();
        final int h=extras.getInt("key");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try);
        Button but3=(Button)findViewById(R.id.button15);
        but3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {   if(h==10){
                Intent intent =new Intent(Try.this,Hard.class);
                Try.this.startActivity(intent);
                android.os.Process.killProcess(android.os.Process.myPid());
            }
                if(h==11){
                    Intent intent =new Intent(Try.this,Function.class);
                    Try.this.startActivity(intent);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
                if(h==12){
                    Intent intent =new Intent(Try.this,Easy.class);
                    Try.this.startActivity(intent);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            }
        });

        Button but4=(Button)findViewById(R.id.button16);
        but4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {

                Intent  intent =new Intent(Try.this,MainActivity.class);
                Try.this.startActivity(intent);
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_try, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onDestroy() {
        Intent intent=new Intent(Try.this,MainActivity.class);
        Try.this.startActivity(intent);

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Try.this,Resume.class);
        Try.this.startActivity(intent);
    }
}
