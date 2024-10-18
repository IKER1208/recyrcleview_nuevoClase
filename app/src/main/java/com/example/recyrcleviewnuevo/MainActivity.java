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

        dinosauriolista.add(new Dinosaurio("Tyrannosaurus Rex", "Carnívoro", "Un depredador temible de gran tamaño.", "Verde", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Triceratops", "Herbívoro", "Con tres cuernos en su cara, es muy resistente.", "Gris", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Velociraptor", "Carnívoro", "Pequeño pero rápido, un cazador inteligente.", "Marrón", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Brachiosaurus", "Herbívoro", "Uno de los dinosaurios más altos, come hojas de árboles altos.", "Verde claro", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Stegosaurus", "Herbívoro", "Reconocible por sus placas en la espalda.", "Gris oscuro", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Spinosaurus", "Carnívoro", "Un gran depredador con una aleta dorsal distintiva.", "Rojo", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Ankylosaurus", "Herbívoro", "Con un cuerpo cubierto de placas, es un gran defensor.", "Marrón claro", R.drawable.des));
        dinosauriolista.add(new Dinosaurio("Pteranodon", "Carnívoro", "Un gran reptil volador, no es un dinosaurio, pero contemporáneo.", "Azul", R.drawable.des));


        DinosaurioAdapter adapter = new DinosaurioAdapter(this, dinosauriolista);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);

    }
}

