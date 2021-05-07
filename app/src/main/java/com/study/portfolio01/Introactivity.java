package com.study.portfolio01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Introactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introactivity);// xml, java 소스 연결
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent); // Intent를 활용하여 해당 페이지 실행 후 바로 MainActivity로 이동
                finish();
            }
            },3000); //3초 후 인트로 실행 }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
