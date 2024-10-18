package com.example.recyrcleviewnuevo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyrcleviewnuevo.adapter.DinosaurioAdapter;
import com.example.recyrcleviewnuevo.models.Dinosaurio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyrcleview);

        List<Dinosaurio> dinosauriolista=new ArrayList<>();

        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));
        dinosauriolista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.des));

        DinosaurioAdapter adapter = new DinosaurioAdapter(dinosauriolista);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);

    }
}

