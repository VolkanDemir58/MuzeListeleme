package com.example.hafta14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecylerView();
    }
    private void initRecylerView(){

        recyclerView=findViewById(R.id.rcvMuzeler);
        MuzeAdaptor muzeAdaptor =new MuzeAdaptor(DataUtil.muzeDatasiAl(), getApplicationContext(), new MuzeAdaptor.OnItemClickListener() {
            @Override
            public void onItemClick(Muze tiklananMuze) {

                Toast.makeText(getApplicationContext(), "Tıklanan Müze : "+tiklananMuze.getIsim(), Toast.LENGTH_SHORT).show();
                Intent detay=new Intent(MainActivity.this,DetayActivity.class);
                detay.putExtra("TASINAN_DATA",tiklananMuze);

                startActivity(detay);

            }
        });


                recyclerView.setAdapter(muzeAdaptor);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


    }


}