package com.example.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tx_welcome;
    private Button btn_course;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        btn_course =findViewById(R.id.course);


        tx_welcome = findViewById(R.id.tx_welcome);


        Intent intent = getIntent();
        String username = intent.getStringExtra("name");
        String username1 = "欢迎"+username +"来到个人空间";


        tx_welcome.setText(username1);
        btn_course.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(CourseActivity.this,ListActivity.class);
        startActivity(intent);


    }
}
