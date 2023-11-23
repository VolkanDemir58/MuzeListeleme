package com.example.hafta14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {
    TextView txtHakkında;
    ImageView imgKapak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        txtHakkında=findViewById(R.id.txtHakkinda);
        imgKapak=findViewById(R.id.imgKapak);

        Muze tasınanMuze=(Muze)getIntent().getParcelableExtra("TASINAN_DATA");
        txtHakkında.setText(tasınanMuze.getHakkinda());
        GlideUtil.resmiIndiripGoster(getApplicationContext(),tasınanMuze.getDetayResimUrl(),imgKapak);


    }
}