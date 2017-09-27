package com.example.android.tallertabletlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarCel extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celulars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_cel);
        tabla = (TableLayout)findViewById(R.id.tabla);
        celulars= Datos.obtener();

        for (int i = 0; i < celulars.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);


            c1.setText(""+(i+1));
            c2.setText(celulars.get(i).getPrecio());
            c3.setText(celulars.get(i).getCapRam());
            c4.setText(celulars.get(i).getMarca());
            c5.setText(celulars.get(i).getColor());
            c6.setText(celulars.get(i).getSistOperativo());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);
            fila.addView(c6);

            tabla.addView(fila);

        }
    }
}
