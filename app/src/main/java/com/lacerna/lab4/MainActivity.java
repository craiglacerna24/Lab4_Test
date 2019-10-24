package com.lacerna.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String [] names;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names = getResources().getStringArray(R.array.versions);
        list = findViewById(R.id.lvVersions);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        Toast.makeText(this, names[i], Toast.LENGTH_LONG).show();
    }
}
