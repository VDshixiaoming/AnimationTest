package com.demo.animationtest.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo.animationtest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button normal, advance, progress;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal = (Button) findViewById(R.id.normal_anim);
        advance = (Button) findViewById(R.id.advance_anim);
        progress = (Button) findViewById(R.id.progressbar_anim);

        normal.setOnClickListener(this);
        advance.setOnClickListener(this);
        progress.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.normal_anim:
                intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("mode", 1);
                break;
            case R.id.advance_anim:
                intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("mode", 2);
                break;
            case R.id.progressbar_anim:
                intent = new Intent(MainActivity.this, TestProgressbarActivity.class);
                break;
        }
        startActivity(intent);
    }
}
