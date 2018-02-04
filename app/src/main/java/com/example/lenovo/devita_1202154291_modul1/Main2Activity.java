package com.example.lenovo.devita_1202154291_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView namaTempat;
    TextView namaMenu;
    TextView Jumlah;
    TextView TotalHarga;
    private final int uang = 65500;
    private String jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaTempat = findViewById(R.id.textView10);
        namaMenu = findViewById(R.id.textView4);
        Jumlah = findViewById(R.id.textView7);
        TotalHarga = findViewById(R.id.textView9);

        Intent mainsatu = getIntent();

        String Tempat=mainsatu.getStringExtra("tempatMakan");
        String nmMenu=mainsatu.getStringExtra("menu");
        String nmMenu=mainsatu.getStringExtra("jumlahpesanan");
        String nmMenu=mainsatu.getStringExtra("harga");

        int JumlahHarga = Integer.valueOf(Totalharga)*Integer.valueOf(JumlahHarga);

        namaTempat.setText(Tempat);
        namaMenu.setText(nmMenu);
        Jumlah.setText(jumlah);
        TotalHarga.setText(String.valueOf(JumlahHarga));

        if (JumlahHarga <= uang) {
            Toast.makeText(this, "makan malam disini? Bisaaa", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Anda makan malam disini? Jangaaaann",Toast.LENGTH_LONG).show();

        }

    }
}
