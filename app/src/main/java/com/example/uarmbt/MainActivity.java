package com.example.uarmbt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView_welcome, textView_UArm, textView_project;
    private ImageView imageView2, imageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_welcome =(TextView)findViewById(R.id.textView_welcome);
        textView_UArm=(TextView)findViewById(R.id.textView_UArm);
        textView_project=(TextView)findViewById(R.id.textView_project);
        imageView2=(ImageView) findViewById(R.id.imageView2);
        imageView3=(ImageView) findViewById(R.id.imageView3);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        textView_welcome.startAnimation(myanim);
        textView_UArm.startAnimation(myanim);
        textView_project.startAnimation(myanim);
        imageView2.startAnimation(myanim);
        imageView3.startAnimation(myanim);

        final Intent i = new Intent(this, start_calibration.class);



        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2700);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }


}


