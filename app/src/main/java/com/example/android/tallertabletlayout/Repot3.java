package com.example.android.tallertabletlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Repot3 extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repot2);
        table = (TableLayout)findViewById(R.id.table);
        celular = Datos.obtener();

        int menor=999999999;
        int aux=0;
        int pos=0;

        for (int i = 0; i <celular.size(); i++){
            if((celular.get(i).getColor().equalsIgnoreCase("blanco")&&celular.get(i).getMarca().equalsIgnoreCase("Huawei")&&celular.get(i).getSistOperativo().equalsIgnoreCase("Android"))){

                aux=Integer.parseInt(celular.get(i).getPrecio());

                if(aux<menor){
                    menor=aux;
                    pos=i;
                }
            }

        }
        TableRow fila = new TableRow(this);
        TextView c1 = new TextView(this);
        TextView c2 = new TextView(this);
        TextView c3 = new TextView(this);
        TextView c4 = new TextView(this);
        TextView c5 = new TextView(this);
        TextView c6 = new TextView(this);

        c1.setText("" + (1));
        c2.setText(celular.get(pos).getPrecio());
        c3.setText(celular.get(pos).getCapRam());
        c4.setText(celular.get(pos).getMarca());
        c5.setText(celular.get(pos).getColor());
        c6.setText(celular.get(pos).getSistOperativo());

        fila.addView(c1);
        fila.addView(c2);
        fila.addView(c3);
        fila.addView(c4);
        fila.addView(c5);
        fila.addView(c6);
        table.addView(fila);
    }
}
