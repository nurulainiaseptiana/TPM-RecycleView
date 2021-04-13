package com.example.tugas3_wisatalombok;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tv_Detail, tv_Nama;
    ImageView iv_Gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item);

        iv_Gambar = findViewById(R.id.ivGambarWisata);
        tv_Nama = findViewById(R.id.tvnamawisata);
        tv_Detail = findViewById(R.id.tvdetailwisata);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if (getIntent().hasExtra("gambar") && getIntent().hasExtra("nama") && getIntent().hasExtra("detail")){
            int gambarwisata = getIntent().getIntExtra("gambar", 0);
            String namawisata = getIntent().getStringExtra("nama");
            String detailwisata = getIntent().getStringExtra("detail");

            setDataActivity(gambarwisata, namawisata, detailwisata);
        }
    }

    private void setDataActivity(int gambarwisata, String namawisata, String detailwisata){
        Glide.with(this).asBitmap().load(gambarwisata).into(iv_Gambar);
        tv_Nama.setText(namawisata);
        tv_Detail.setText(detailwisata);
    }
}

