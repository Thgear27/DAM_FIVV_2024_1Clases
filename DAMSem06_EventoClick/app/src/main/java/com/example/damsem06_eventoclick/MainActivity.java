package com.example.damsem06_eventoclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button_primero);
        List<String> alicates = new ArrayList<>();
        alicates.add("Mosco");
        alicates.add("Nuevo");
        String respuesta = alicates.stream().map(e -> e + " ").collect(Collectors.joining());
        btn1.setOnClickListener(view-> Toast.makeText(this,respuesta, Toast
                .LENGTH_SHORT).show());

        TextView tv2 = findViewById(R.id.textView_segundo);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Clic en el Texto 2", Toast.LENGTH_SHORT).show());
    }


}