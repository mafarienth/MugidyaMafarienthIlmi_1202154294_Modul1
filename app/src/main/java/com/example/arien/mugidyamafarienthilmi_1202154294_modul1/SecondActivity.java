package com.example.arien.mugidyamafarienthilmi_1202154294_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arien.lesson2.R;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //5. Get Intent digunakan untuk mengambil intent yang dikirim di activity sebelumnya
        Intent intent = getIntent();
        String tempat = intent.getStringExtra("namaTempat");

        Intent intent2 = getIntent();
        String menu = intent2.getStringExtra("menu");

        Intent intent3 = getIntent();
        String porsi = intent3.getStringExtra("porsi");

        int totalPorsi = Integer.parseInt(porsi);
        Intent intent4 = getIntent();

        String uangOsas = intent4.getStringExtra("uOsas");
        int uang = Integer.parseInt(uangOsas);

        if (tempat.contains("Eatbus")) {
            int harga = 50000;
            int totalHarga = harga * totalPorsi;

            if (uang >= totalHarga) {
                TextView textView_tempat = findViewById(R.id.textViewTempat);
                textView_tempat.setText(tempat);

                TextView textView_menu = findViewById(R.id.textViewMenu);
                textView_menu.setText(menu);

                TextView textView_porsi = findViewById(R.id.textViewPorsi);
                textView_porsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textView_harga = findViewById(R.id.textViewHarga);
                textView_harga.setText(hasil);

                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
            } else {
                TextView textView_makan = findViewById(R.id.textViewTempat);
                textView_makan.setText(tempat);

                TextView textView_menu = findViewById(R.id.textViewMenu);
                textView_menu.setText(menu);

                TextView textView_porsi = findViewById(R.id.textViewPorsi);
                textView_porsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textView_harga = findViewById(R.id.textViewHarga);

                textView_harga.setText(hasil);

                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }

        } else {
            int harga = 30000;
            int totalHarga = harga * totalPorsi;
            if (uang >= totalHarga) {
                TextView textView_makan = findViewById(R.id.textViewTempat);
                textView_makan.setText(tempat);

                TextView textView_menu = findViewById(R.id.textViewMenu);
                textView_menu.setText(menu);

                TextView textView_porsi = findViewById(R.id.textViewPorsi);
                textView_porsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textView_harga = findViewById(R.id.textViewHarga);
                textView_harga.setText(hasil);

                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
            } else {
                TextView textView_makan = findViewById(R.id.textViewTempat);
                textView_makan.setText(tempat);

                TextView textView_menu = findViewById(R.id.textViewMenu);
                textView_menu.setText(menu);

                TextView textView_porsi = findViewById(R.id.textViewPorsi);
                textView_porsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView textView_harga = findViewById(R.id.textViewHarga);

                textView_harga.setText(hasil);

                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }
        }

    }
}