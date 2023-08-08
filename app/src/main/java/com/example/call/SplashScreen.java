//package com.example.call;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.Window;
//import android.view.WindowManager;
//import android.widget.ProgressBar;
//
//public class SplashScreen extends AppCompatActivity {
//
//    private ProgressBar progressBar;
//    private int a;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        setContentView(R.layout.activity_splash_screen);
//        progressBar=findViewById(R.id.progressId);
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                doWork();
//                StratApp();
//            }
//        });
//    }
//    public  void doWork(){
//        for (a=20;a<=100;a=a+20){
//            try {
//                Thread.sleep(100);
//                progressBar.setProgress(a);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//
//    }
//    public  void StratApp(){
//        Intent intent=new Intent(SplashScreen.this,MainActivity.class);
//        startActivity(intent);
//        finish();
//    }
//}



package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        progressBar=findViewById(R.id.progressId);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                StratApp();
            }
        });

        // Start the thread
        thread.start();
    }

    public void doWork() {
        for (a = 20; a <= 100; a = a + 20) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void StratApp() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
