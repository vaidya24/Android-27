package com.vaishnavi.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {
    int[]images;
    String[] names;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        images=new int[]{R.drawable.adypu,R.drawable.adypu2,R.drawable.adypu3};


        names=new String[] {"kitkat","kitkat2","loli","lolipop","lollipop"};
        LinearLayoutManager linearLayoutManager=
                new LinearLayoutManager(DashboardActivity.this);

        VersionAdapter adapter=new VersionAdapter(DashboardActivity.this,getList(images,names),this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<AndroidVERSION> getList(int [] images , String[]names){

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




