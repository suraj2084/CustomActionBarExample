package com.example.android.customactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    toolbar=findViewById(R.id.ToolBar);
    //Step1
    setSupportActionBar(toolbar);
    setTitle("MyActionBar");

    //Step2
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    //Step for Option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        if(item_id==R.id.opt_copy){
            Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
        }else if(item_id==R.id.opt_paste){
            Toast.makeText(this, "Paste", Toast.LENGTH_SHORT).show();
        }else if(item_id==R.id.opt_save){
            Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show();
        }else if(item_id==android.R.id.home){
           super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}