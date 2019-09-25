package com.example.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.testapplication.R.id.btn_login;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_username, et_password;

    private Button btn_login;
    private Button btn_exit;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = findViewById(R.id.username);
        et_password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        Button exit = findViewById(R.id.exit);
        login.setOnClickListener(this);
        exit.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                String userName = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (userName.isEmpty() && password.isEmpty()) {
                    Toast.makeText(MainActivity.this,"空的输入",Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(MainActivity.this, CourseActivity.class);
                    intent.putExtra("name",userName);
                    startActivity(intent);
                }
                break;
            case R.id.exit:
                finish();
                break;
        }
    }
}







