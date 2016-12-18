package com.example.abymani.workinglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] android_versions={
            "cupcake",
            "Donoir",
            "Gingerbread",
            "Froyo",
            "HoneyComb",
            "Jellybean",
            "Lollipop",
            "rockneoll",
            "Google",
            "blooger",
            "Pakistan"

    };

    String[] android_ver={
            "cupcake",
            "Donoir",
            "Gingerbread",
            "Froyo",
            "HoneyComb",


    };

    ListView versions;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        versions=(ListView)findViewById(R.id.listview);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android_versions);
        versions.setAdapter(adapter);

        versions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),(String)adapterView.getItemAtPosition(i),Toast.LENGTH_LONG).show();
            }
        });



    }
}
