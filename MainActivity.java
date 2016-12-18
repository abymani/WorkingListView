package com.example.abymani.workinglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int[] moviePosterResources= {R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7};
    String[] movieRatings;
    String[] movieTitles;
    MovieAdapter adapter;

    ListView versions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        versions=(ListView)findViewById(R.id.listview);
        movieRatings=getResources().getStringArray(R.array.movieRatings);
        movieTitles=getResources().getStringArray(R.array.Movie_title);
        adapter=new MovieAdapter(getApplicationContext(),R.layout.list_item_layout);
        versions.setAdapter(adapter);

        int i=0;
        for(String titles:movieTitles)
        {
            MovieDataProvider movieDataProvider= new MovieDataProvider(moviePosterResources[i],titles,movieRatings[i]);
            adapter.add(movieDataProvider);
            i++;
        }





    }
}
