package com.university.todo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    private Intent menint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.about_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.main:
                menint = new Intent(this,MainActivity.class);
                startActivity(menint);
                finish();
                return true;
            case R.id.accsettings:
                menint = new Intent(this,AccountSettings.class);
                startActivity(menint);
                finish();
                return true;
            case R.id.theme:
                Toast.makeText(this,"Item 3 is selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.dark_mode_switch:
                Toast.makeText(this,"Sub Item 1 is selected",Toast.LENGTH_SHORT).show();
                return true;
            default:return super.onOptionsItemSelected(menuItem);
        }

    }
}