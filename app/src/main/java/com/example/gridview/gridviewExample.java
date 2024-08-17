package com.example.gridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class gridviewExample extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate( Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.gridview_example);
        gridView = findViewById(R.id.mygrid);
        //string array
        String names[] = {"Ram", "Sita", "Hari", "Ram", "Sita", "Hari", "Ram", "Sita", "Hari", "Ram", "Sita", "Hari", "Ram", "Sita", "Hari"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, R.layout.gridview_item, R.id.gridtext, names);
        gridView.setAdapter(adapter);
    }
}
