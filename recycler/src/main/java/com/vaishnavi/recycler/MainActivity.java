package com.vaishnavi.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int[]images;
    String[] names;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        images=new int[]{R.drawable.kitkat,R.drawable.kitkat2,R.drawable.loli,R.drawable.lolipop,
        R.drawable.lollipop};

       names=new String[] {"kitkat","kitkat2","loli","lolipop","lollipop"};
        LinearLayoutManager linearLayoutManager=
                new LinearLayoutManager(MainActivity.this);

        VersionAdapter adapter=new VersionAdapter(MainActivity.this,getList(images,names),this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<AndroidVERSION> getList(int [] images ,String[]names){

        List<AndroidVERSION> list=new ArrayList<>();
        for(int i=0;i<images.length;i++){
            AndroidVERSION version=new AndroidVERSION();
            version.setImage(images[i]);
            version.setName(names[i]);
            list.add(version);


        }
        return list;
    }
}
