package com.digicon_valley.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] movie_poster_res={R.drawable.movie_1,R.drawable.movie_2,
            R.drawable.movie_3,R.drawable.movie_4,
            R.drawable.movie_5,R.drawable.movie_6,
            R.drawable.movie_7,R.drawable.movie_8,
            R.drawable.movie_9,R.drawable.movie_10,
            R.drawable.movie_11,R.drawable.movie_12,
            R.drawable.movie_13,R.drawable.movie_14,};

    String[] movie_titles;
    String[] movie_ratings;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        adapter=new MovieAdapter(getApplicationContext(),R.layout.linear_layout);
        listView.setAdapter(adapter);
        movie_ratings=getResources().getStringArray(R.array.movie_ratings);
        movie_titles=getResources().getStringArray(R.array.movie_titles);
    int i=0;

    for (String titles:movie_titles){

        MovieDataProvider dataProvider=new MovieDataProvider(movie_poster_res[i],movie_titles[i],movie_ratings[i]);
        adapter.add(dataProvider);
        i++;
    }
    }
}
