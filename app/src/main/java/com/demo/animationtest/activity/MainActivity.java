package com.demo.animationtest.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo.animationtest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button normal, advance;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal = (Button) findViewById(R.id.normal_anim);
        advance = (Button) findViewById(R.id.advance_anim);
        normal.setOnClickListener(this);
        advance.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, TestActivity.class);
        if(view.getId() == R.id.normal_anim){
            intent.putExtra("mode", 1);
        }else {
            intent.putExtra("mode", 2);
        }
        startActivity(intent);
    }
}
