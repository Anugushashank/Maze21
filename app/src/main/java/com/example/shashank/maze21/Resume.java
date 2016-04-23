package com.example.shashank.maze21;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Resume extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent in=getIntent();
        Bundle extras=in.getExtras();
        final int h=extras.getInt("ke");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        Button but3=(Button)findViewById(R.id.button5);
        but3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {

                if(h==22){
                    Intent intent =new Intent(Resume.this,Hard.class);
                    Resume.this.startActivity(intent);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
                if(h==21){
                    Intent intent =new Intent(Resume.this,Function.class);
                    Resume.this.startActivity(intent);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
                if(h==20){
                    Intent intent =new Intent(Resume.this,Easy.class);
                    Resume.this.startActivity(intent);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            }
        });
        Button but4=(Button)findViewById(R.id.button6);
        but4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {

                Intent  intent =new Intent(Resume.this,MainActivity.class);
                Resume.this.startActivity(intent);
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resume, menu);
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
        Intent intent=new Intent(Resume.this,MainActivity.class);
        Resume.this.startActivity(intent);

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Resume.this,MainActivity.class);
        Resume.this.startActivity(intent);
    }
}
