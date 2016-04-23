package com.example.shashank.maze21;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;


public class Easy extends Activity {
    TextView text1;
    int m=0;
    private static final String FORMAT = "%02d:%02d:%02d";

    int seconds , minutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        text1=(TextView)findViewById(R.id.textView9);
        View vi = (View) findViewById(R.id.main);
        vi.setX(2);
        vi.setY(2);

        Button but=(Button)findViewById(R.id.button9);
        but.setOnTouchListener(new View.OnTouchListener() {
            public android.os.Handler mHandler;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction);
                        mHandler = null;
                        break;
                }
                return false;
            }
            View vi = (View) findViewById(R.id.main);
            Runnable mAction = new Runnable() {
                @Override

                public void run() {
                    // Do continuous task.
                    RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.anugu);
                    View vi = (View) findViewById(R.id.main);
                    View vi1 = (View) findViewById(R.id.dup);
                    float a = vi.getX();
                    float b = vi.getY();
                    int child = relativeLayout.getChildCount();
                    int k = 0, i;
                    if(m==0) {
                        new CountDownTimer(15000, 1000) {

                            public void onTick(long millisUntilFinished) {

                                text1.setText("" + String.format(FORMAT,
                                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                            }

                            public void onFinish() {
                                Intent intent=new Intent(Easy.this,Try.class);
                                intent.putExtra("key",12);
                                Easy.this.startActivity(intent);
                            }
                        }.start();
                    }
                    if(vi.getX()==vi1.getX() && vi.getY()==vi1.getY()){


                        finish();
                    }
                    for (i = 0; i < child; i++) {
                        View v = relativeLayout.getChildAt(i);
                        if (v != vi) {
                            if (v != vi1) {
                                if (vi.getX() + 18 >= v.getX() && vi.getX() + 1 <= v.getX() + v.getWidth() && vi.getY() + 15 >= v.getY() && vi.getY() <= v.getY() + v.getHeight()) {
                                    k++;
                                    break;
                                }
                            }
                        }
                    }
                    m++;
                    if (k == 0) {

                        vi.setX(a + 1);


                    }
                    mHandler.postDelayed(this, 1);
                }
            };
        });
        Button but1=(Button)findViewById(R.id.button7);
        but1.setOnTouchListener(new View.OnTouchListener() {
            public android.os.Handler mHandler;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction);
                        mHandler = null;
                        break;
                }
                return false;
            }
            View vi = (View) findViewById(R.id.main);
            Runnable mAction = new Runnable() {
                @Override

                public void run() {
                    RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.anugu);
                    View vi = (View) findViewById(R.id.main);
                    View vi1 = (View) findViewById(R.id.dup);
                    float a = vi.getX();
                    float b = vi.getY();
                    if(vi.getX()==vi1.getX() && vi.getY()==vi1.getY()){


                        finish();
                    }
                    int child = relativeLayout.getChildCount();
                    int k = 0, i;
                    if(m==0) {
                        new CountDownTimer(15000, 1000) {

                            public void onTick(long millisUntilFinished) {

                                text1.setText("" + String.format(FORMAT,
                                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                            }

                            public void onFinish() {
                                Intent intent=new Intent(Easy.this,Try.class);
                                intent.putExtra("key",12);
                                Easy.this.startActivity(intent);
                            }
                        }.start();
                    }
                    for (i = 0; i < child; i++) {
                        View v = relativeLayout.getChildAt(i);
                        if (v != vi ) {
                            if(v!=vi1) {
                                if (vi.getY() - 1 <= v.getY() + v.getHeight() && vi.getY() + 13 >= v.getY() + v.getHeight() && vi.getX() + 15 >= v.getX() && vi.getX() <= v.getX() + v.getWidth()) {
                                    k++;
                                    break;
                                }
                            }
                        }
                    }
                    m++;
                    if (k == 0) {
                        if (b >= 10) {
                            vi.setY(b - 1);

                        }
                    }
                    mHandler.postDelayed(this, 1);
                }
            };
        });
        Button but2=(Button)findViewById(R.id.button10);
        but2.setOnTouchListener(new View.OnTouchListener() {
            public android.os.Handler mHandler;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction);
                        mHandler = null;
                        break;
                }
                return false;
            }
            View vi = (View) findViewById(R.id.main);
            Runnable mAction = new Runnable() {
                @Override

                public void run(){
                    RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.anugu);
                    View vi = (View) findViewById(R.id.main);
                    View vi1 = (View) findViewById(R.id.dup);
                    float a = vi.getLeft();
                    float b = vi.getY();
                    int child = relativeLayout.getChildCount();
                    int i;
                    int k=0;
                    if(m==0) {
                        new CountDownTimer(15000, 1000) {

                            public void onTick(long millisUntilFinished) {

                                text1.setText("" + String.format(FORMAT,
                                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                            }

                            public void onFinish() {
                                Intent intent=new Intent(Easy.this,Try.class);
                                intent.putExtra("key",12);
                                Easy.this.startActivity(intent);
                            }
                        }.start();
                    }
                    if(vi.getX()==vi1.getX() && vi.getY()==vi1.getY()){


                        finish();
                    }
                    for (i = 0; i < child; i++) {
                        View v = relativeLayout.getChildAt(i);
                        if (v != vi) {
                            if (v != vi1) {
                                if (vi.getY() + 17 >= v.getY() && vi.getY() + 2 <= v.getY() + v.getHeight() && vi.getX() + 15 >= v.getX() && vi.getX() <= v.getX() + v.getWidth()) {
                                    k++;

                                    break;
                                }
                            }
                        }
                    }
                    m++;
                    if (k == 0) {
                        vi.setY(b + 1);
                    }

                    mHandler.postDelayed(this, 1);
                }
            };
        });
        Button but3=(Button)findViewById(R.id.button8);
        but3.setOnTouchListener(new View.OnTouchListener() {
            public android.os.Handler mHandler;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 1);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction);
                        mHandler = null;
                        break;
                }
                return false;
            }
            View vi = (View) findViewById(R.id.main);
            Runnable mAction = new Runnable() {
                @Override

                public void run() {

                    RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.anugu);
                    View vi = (View) findViewById(R.id.main);
                    View vi1 = (View) findViewById(R.id.dup);
                    float a = vi.getX();
                    float b = vi.getY();
                    int child = relativeLayout.getChildCount();
                    int k = 0, i;
                    float x=0;
                    if(m==0) {
                        new CountDownTimer(15000, 1000) {

                            public void onTick(long millisUntilFinished) {

                                text1.setText("" + String.format(FORMAT,
                                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                            }

                            public void onFinish() {
                                Intent intent=new Intent(Easy.this,Try.class);
                                intent.putExtra("key",12);
                                Easy.this.startActivity(intent);
                            }
                        }.start();
                    }
                    if(vi.getX()==vi1.getX() && vi.getY()==vi1.getY()){


                        finish();
                    }
                    for (i = 0; i < child; i++) {
                        View v = relativeLayout.getChildAt(i);
                        if (v != vi) {
                            if (v != vi1) {
                                if (vi.getX() - 1 <= v.getX() + v.getWidth() && vi.getX() + 9 >= v.getX() + v.getWidth() && vi.getY() + 15 >= v.getY() && vi.getY() <= v.getY() + v.getHeight()) {
                                    k++;

                                    break;
                                }
                            }
                        }
                    }
                    m++;
                    if (k == 0) {

                        vi.setX(a - 1);


                    }
                    mHandler.postDelayed(this, 1);
                }
            };
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_easy, menu);
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
          super.onDestroy();
        Intent intent=new Intent(Easy.this,Function.class);
        Easy.this.startActivity(intent);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Easy.this,Resume.class);
        intent.putExtra("ke",20);
        Easy.this.startActivity(intent);
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}
