package com.example.abymani.workinglistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abymani on 19/12/2016.
 */

public class MovieAdapter extends ArrayAdapter {
    List list=new ArrayList();
    MovieDataProvider dataProvider;

    public MovieAdapter(Context context, int resource) {
        super(context, resource);
    }
     @Override
    public void add(Object object){

         list.add(object);
         super.add(object);
     }

    static class DataHandler
    {
        ImageView movieposter;

        TextView title;
        TextView rating;


    }

    @Override
    public int getCount(){
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        DataHandler handler;
        if(convertView==null){

            LayoutInflater layoutInflater=(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.list_item_layout,parent,false);
            handler=new DataHandler();
            handler.movieposter=(ImageView) row.findViewById(R.id.imageView);
            handler.title=(TextView) row.findViewById(R.id.movieTitle);
            handler.rating=(TextView) row.findViewById(R.id.rating);
            row.setTag(handler);
        }
        else
        {
            handler=(DataHandler) row.getTag();
        }
        dataProvider=(MovieDataProvider) this.getItem(position);
        handler.movieposter.setImageResource(dataProvider.getMoviePosterResource());
        handler.title.setText(dataProvider.getMovieTitle());
        handler.rating.setText(dataProvider.getMovieRating());
        return row;
    }
}
