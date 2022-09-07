package com.example.myappaboscan;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout Constraintlayout = findViewById(R.id.mainLayout);
        AnimationDrawable AnimationDrawable = (AnimationDrawable) Constraintlayout.getBackground();
        AnimationDrawable.setEnterFadeDuration(2500);
        AnimationDrawable.setExitFadeDuration(5000);
        AnimationDrawable.start();



    }


    public void intlogin(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }

    public void actForm(View view) {
        Intent intent = new Intent(this,FormActivity.class);
        startActivity(intent);
    }
}