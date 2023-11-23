package com.example.hafta14;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class MuzeAdaptor extends RecyclerView.Adapter<MuzeViewHolder> {
    ArrayList<Muze>muzeler;
    Context context;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(Muze tiklananMuze);

    }

    public MuzeAdaptor(ArrayList<Muze> muzeler, Context context,OnItemClickListener onItemClickListener) {
        this.muzeler = muzeler;
        this.context = context;
        this.onItemClickListener = onItemClickListener;

    }
    @NonNull
    @Override
    public MuzeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_muze,parent,false);
        MuzeViewHolder muzeViewHolder =new MuzeViewHolder(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(muzeler.get(muzeViewHolder.getAdapterPosition()));
            }
        });
        return muzeViewHolder;










    }
    @Override
    public void onBindViewHolder(@NonNull MuzeViewHolder viewHolder, int position) {
        viewHolder.txtAdi.setText(muzeler.get(position).getIsim());
        viewHolder.txtSemt.setText(muzeler.get(position).getSemt());
        GlideUtil.resmiIndiripGoster(context,muzeler.get(position).getResimUrl(),viewHolder.imgMuze);
    }
    @Override
    public int getItemCount() {
        return muzeler.size();
    }
}

