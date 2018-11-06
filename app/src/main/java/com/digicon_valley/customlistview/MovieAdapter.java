package com.digicon_valley.customlistview;

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

public class MovieAdapter extends ArrayAdapter {
    List list=new ArrayList();
    public MovieAdapter(Context context, int resource) {

        super(context, resource);
    }
    static class DataHandler{
        ImageView poster;
        TextView title;
        TextView rating;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        View row;
        row=convertView;
        DataHandler handler;
        if (convertView==null){

            LayoutInflater inflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.linear_layout,parent,false);
        handler=new DataHandler();
            handler.poster=row.findViewById(R.id.movie_poster);
            handler.title=row.findViewById(R.id.movie_title);
            handler.rating=row.findViewById(R.id.movie_rating);
            row.setTag(handler);
        }else
            {
                handler=(DataHandler)row.getTag();}

                MovieDataProvider dataProvider;
        dataProvider= (MovieDataProvider) this.getItem(position);
        handler.poster.setImageResource(dataProvider.getMovie_poster_res());
        handler.title.setText(dataProvider.getMovie_title());
        handler.rating.setText(dataProvider.getMovie_rating());
        return row;
    }
}
