package com.luise.asynctaskapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.luise.asynctaskapp.service.ui.ServiceActivity;
import com.luise.asynctaskapp.task.ui.TaskActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toServiceActivity(View view) {
        startActivity(new Intent(this, ServiceActivity.class));
    }
    public void toTaskActivity(View view) {
        startActivity(new Intent(this, TaskActivity.class));
    }
}
