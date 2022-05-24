package com.bsef19m517.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button lesson, exam, repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lesson = findViewById(R.id.button);
        exam = findViewById(R.id.button2);
        repo = findViewById(R.id.button3);

        lesson.setOnClickListener(this);
        exam.setOnClickListener(this);
        repo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                Intent intent1 = new Intent(MainActivity.this,LessonOne.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this,Exam.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Uri webpage = Uri.parse("https://github.com/BSEF19M517/MC_HomeTasks");
                Intent intent3 = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(intent3);
                break;
        }
    }
}