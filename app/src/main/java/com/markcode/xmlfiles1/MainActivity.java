package com.markcode.xmlfiles1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello=findViewById(R.id.txtHello);
        txtHello.setText(getString(R.string.hello));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.settings_menu){
            Toast.makeText(this, "settings selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.alarm_menu) {
            Toast.makeText(this, "Alarm selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }

}