package com.example.arien.mugidyamafarienthilmi_1202154294_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.arien.lesson2.R;

public class MainActivity extends AppCompatActivity {

    //1. Mendeklarasikan Variabel variabel yang dibutuhkan
    EditText editText_menu, editText_porsi;
    TextView textView_tempat, textView_menu, textView_porsi, textView_harga;
    Button bEatbus, bAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. gunakan findViewByID untuk mendapatkan referensi tentang contoh EditText, Textview dan Button
        // menetapkannya ke variabel privat

        editText_menu = (EditText) findViewById(R.id.editTextMenu);
        editText_porsi = (EditText) findViewById(R.id.editTextPorsi);
        textView_tempat = (TextView) findViewById(R.id.textViewTempat);
        textView_menu = (TextView) findViewById(R.id.textViewMenu);
        textView_porsi = (TextView) findViewById(R.id.textViewPorsi);
        textView_harga = (TextView) findViewById(R.id.textViewHarga);
        bEatbus = (Button) findViewById(R.id.buttonEatbus);
        bAbnormal = (Button) findViewById(R.id.buttonAbnormal);
    }

    public void eatbus(View view) {
        //3. Buat Intent eksplisit baru, untuk menuju ke second activity
        Intent intent = new Intent(this, SecondActivity.class);

        //4. Deklarasikan variabel uang yang dimiliki Osas, nama tempat makan, menu dan porsi
        //lalu masukkan intent put Extra untuk memasukkan pesan di intent

        int uang = 65500;
        String uOsas = String.valueOf(uang);
        intent.putExtra("uOsas", uOsas);

        String namaTempat = "Eatbus";
        intent.putExtra("namaTempat", namaTempat);

        String menu = editText_menu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = editText_porsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);


    }

    public void apnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int uang = 65500;
        String uOsas = String.valueOf(uang);
        intent.putExtra("uOsas", uOsas);

        String namaTempat = "Abnormal";
        intent.putExtra("namaTempat", namaTempat);;

        String menu = editText_menu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = editText_porsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
}
