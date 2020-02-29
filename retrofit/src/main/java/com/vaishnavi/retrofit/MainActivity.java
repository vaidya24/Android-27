package com.vaishnavi.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.vaishnavi.retrofit.domain.Response;
import com.vaishnavi.retrofit.rest.GetDataService;
import com.vaishnavi.retrofit.rest.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void getAllEmployees(){
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<Response> call=service.getAllEmployee();
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.code()==200){
                    Log.i("@main","Employee=============>"+response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.i("@main","error=============>"+t.getMessage());


            }
        });
    }
}
