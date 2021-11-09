package com.example.layoutsandroid081121;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Desing> acomodo;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        construirRecycler();

    }

    private void llenar() {
        acomodo.add(new Desing("CONTROL XBOX ONE","Este mando combina funciones revolucionarias mientras conserva precisión, comodidad y exactitud en cada movimiento.","$1,397",R.drawable.xbox__2_));
        acomodo.add(new Desing("TENIS KYRIE 7","Usa la misma fuerza creativa de Kyrie Irving en cada práctica y partido de básquetbol con los Tenis Nike Kyrie 7","2,599",R.drawable.kyrie));
        acomodo.add(new Desing("SAMSUNG GALAXY S21 ULTRA", "Fotografía profesional en tu bolsillo.\n" +
                "Descubre infinitas posibilidades para tus fotos con las 4 cámaras principales de tu equipo.  ","$27,488",R.drawable.samsungs21));
        acomodo.add(new Desing("CHAQUETA FINA","A Prueba De Viento Casual Para Hombre De Otoño","$586",R.drawable.chamrra));
        acomodo.add(new Desing("SMART TV DAEWOO", "Modelo: L43B7500QN\n" + "Televisor a color LED\n" + "3 Entradas HDMI\n" +
                "Resolución FHD (1920 x 1080) ","$7,999",R.drawable.pantalla));
        acomodo.add(new Desing("BATERÍA DE COCINA KUCHE","*Reduce el consumo de grasa hasta un 90%\n" +
                "*Sus mangos de silicona suave aislan el calor.\n" +
                "*Fácil de limpiar.","$2,198",R.drawable.sarten));
        acomodo.add(new Desing("NIBOSI SKELETON RELOJ","Tipo de artículo: Relojes de cuarzo Estilo: deporte Nombre de la marca: NIBOSI ","515",R.drawable.reloj));
        acomodo.add(new Desing("AUDÍFONOS BEATS SOLO PRO","Inspírate con los audífonos inalámbricos SoloPro. Para que el sonido se reproduzca como tú quieras","5,479",R.drawable.audifonos));
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1: Acomodo.visualization= Acomodo.list;
                break;
            case  R.id.btn2:
                Acomodo.visualization= Acomodo.grid;
                break;
        }
        construirRecycler();
        
    }

    private void construirRecycler() {

        acomodo=new ArrayList<>();
        recycler=findViewById(R.id.recyclerId);

        if (Acomodo.visualization== Acomodo.list){
            recycler.setLayoutManager(new LinearLayoutManager(this));

        }else{
            recycler.setLayoutManager(new GridLayoutManager(this,2));
        }

        //Lenado
        llenar();
        AdapterDate adaptador = new AdapterDate(acomodo);
        recycler.setAdapter(adaptador);
    }
}