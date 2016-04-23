package com.example.shashank.maze21;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import android.os.Handler;
import android.widget.TextView;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textView4);
        textView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                Intent intent=new Intent(MainActivity.this,Function.class);
                MainActivity.this.startActivity(intent);

            }
        });
        TextView textView3=(TextView)findViewById(R.id.textView14);
        textView3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                Intent intent=new Intent(MainActivity.this,Hard.class);
                MainActivity.this.startActivity(intent);

            }
        });
        TextView textView1=(TextView)findViewById(R.id.textView3);
        textView1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                finish();


            }
        });
        TextView textView2=(TextView)findViewById(R.id.textView5);
        textView2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                Intent intent=new Intent(MainActivity.this,Easy.class);
                MainActivity.this.startActivity(intent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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



        android.os.Process.killProcess(android.os.Process.myPid());

    }
}
