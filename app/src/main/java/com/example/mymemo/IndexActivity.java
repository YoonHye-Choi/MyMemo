package com.example.mymemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        //핸들러 객체 생성
        //핸들러: 일정시간 뒤에 원하는 작업 수행하게 만들 수 있음
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() { //postDelayed 메서드를 사용하기 위해선 Runnable 객체를 인자로 자정해야함
            @Override
            public void run() {
                goMainActivity();
            }
        },1500); //여기서 1500의 단위는 ms(밀리 세컨드)
    }

    public void goMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
