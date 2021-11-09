package com.example.fragmentanimation;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.slide_in, R.anim.empty, R.anim.empty, R.anim.slide_out)
                        .add(R.id.fragmentHost, MyFragment.class, null)
                        .addToBackStack(null)
                        .commitAllowingStateLoss();
            }
        });
    }
}