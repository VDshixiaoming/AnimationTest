package com.demo.animationtest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.demo.animationtest.R;

/**
 * TITLE
 * Created by shixiaoming on 17/1/3.
 */

public class TestProgressbarActivity extends AppCompatActivity {
    private ProgressBar imageView;
    private TextView textView;
    private Button playBtn;
    private boolean start = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_test);

        imageView = (ProgressBar) findViewById(R.id.imgview);
        textView = (TextView) findViewById(R.id.title);
        playBtn = (Button) findViewById(R.id.play_btn);

        textView.setText("普通帧动画");
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!switchBtn()) {
                    imageView.setVisibility(View.VISIBLE);
                } else {
                    imageView.setVisibility(View.GONE);
                }

            }
        });
    }

    //控制开关
    private boolean switchBtn() {
        boolean returnV = start;
        start = !start;

        playBtn.setText(start == false ? "START" : "STOP");
        return returnV;
    }
}