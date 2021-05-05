package com.example.dodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.buyList) {
            Intent buyListIntent = new Intent(this, BuyList.class);
            startActivity(buyListIntent);
            return true;
        } else if (id == R.id.calendar) {
            Intent calendarIntent = new Intent(this, Calendar.class);
            startActivity(calendarIntent);
            return true;
        } else if (id == R.id.taskList) {
            Intent taskListIntent = new Intent(this, TaskList.class);
            startActivity(taskListIntent);
            return true;
        } else if (id == R.id.reminder) {
            return true;
        } else if (id == R.id.tasks) {
            Intent tasksIntent = new Intent(this, MainActivity.class);
            startActivity(tasksIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}