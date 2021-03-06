package com.example.android.tallertabletlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Repot2 extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repot2);
        table = (TableLayout)findViewById(R.id.table);
        celular = Datos.obtener();

        for (int i = 0; i <celular.size(); i++){
            if((Integer.parseInt(celular.get(i).getCapRam())<5)
                    && Integer.parseInt(celular.get(i).getCapRam())>1
                    && celular.get(i).getMarca().equalsIgnoreCase("Samsung")){


                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);
                TextView c6 = new TextView(this);

                c1.setText("" + (i + 1));
                c2.setText(celular.get(i).getPrecio());
                c3.setText(celular.get(i).getCapRam());
                c4.setText(celular.get(i).getMarca());
                c5.setText(celular.get(i).getColor());
                c6.setText(celular.get(i).getSistOperativo());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);
                table.addView(fila);
            }
        }
    }
}
