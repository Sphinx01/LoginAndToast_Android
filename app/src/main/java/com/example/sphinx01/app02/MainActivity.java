package com.example.sphinx01.app02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view){
        EditText username = (EditText)findViewById(R.id.username_txtField);
        EditText password = (EditText)findViewById(R.id.password_txtField);
        Log.i("Login value", username.getText().toString());
        Log.i("Login value", password.getText().toString());
        Log.i("Sign in:", "you clicked sign in");
        Toast.makeText(getApplicationContext(), "Welcome back "+username.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
