package com.example.tugas3_wisatalombok;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.ViewHolder> {
    private Context context;
    private ArrayList<ModelWisata> modelWisata= new ArrayList<>();

    public AdapterWisata(Context context){
        this.context = context;
    }

    public ArrayList<ModelWisata> getWisataModel() {

        return modelWisata;
    }

    public void setModelWisata(ArrayList<ModelWisata> modelWisata) {
        this.modelWisata = modelWisata;
    }
    @NonNull
    @Override
    public AdapterWisata.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View wisataRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new AdapterWisata.ViewHolder(wisataRow);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWisata.ViewHolder holder, int i) {
        Glide.with(context).load(getWisataModel().get(i).getGambarWisata()).into(holder.ivGambarWisata);
        holder.tvNamaWisata.setText(getWisataModel().get(i).getNamaWisata());

        holder.btnShare.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getWisataModel().get(i).getDetailWisata());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });

        holder.btnDetail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("gambar", getWisataModel().get(i).getGambarWisata());
                intent.putExtra("nama", getWisataModel().get(i).getNamaWisata());
                intent.putExtra("detail", getWisataModel().get(i).getDetailWisata());
                context.startActivity(intent);
            }
        });
    }

    public int getItemCount() {

        return modelWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGambarWisata;
        private TextView tvNamaWisata, tvDeskripsiElemen;
        private Button btnDetail, btnShare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivGambarWisata= itemView.findViewById(R.id.iv_gambarwisata);
            tvNamaWisata = itemView.findViewById(R.id.tv_namawisata);
            btnDetail = itemView.findViewById(R.id.btn_detail);
            btnShare = itemView.findViewById(R.id.btn_share);

        }
    }
}
