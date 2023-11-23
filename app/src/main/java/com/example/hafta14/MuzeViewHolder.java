package com.example.hafta14;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MuzeViewHolder extends RecyclerView.ViewHolder {

    ImageView imgMuze;
    TextView txtAdi;
    TextView txtSemt;
    public MuzeViewHolder(@NonNull View itemView) {
        super(itemView);
        imgMuze=itemView.findViewById(R.id.imgResim);
        txtAdi=itemView.findViewById(R.id.txtAdi);
        txtSemt=itemView.findViewById(R.id.txtSemt);
    }
}