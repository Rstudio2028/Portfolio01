package com.study.portfolio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;

public class reward01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward01);

        ScratchView scratchView = findViewById(R.id.scratchView);
        scratchView.setRevealListener(new ScratchView.IRevealListener() {
            @Override
            public void onRevealed(ScratchView scratchView) {
                Toast.makeText(reward01.this, "꽝입니다. 다시 도전해주세요.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {
                //you can find the percentage of card revealed
            }
        });
    }
}