package com.vaishnavi.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionHolder>{
    private Context context;
    private List<AndroidVersion> list;
    private AlertDialog.Builder builder;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version_adapter);
    }
}
