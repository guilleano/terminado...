package com.example.android.tallertabletlayout;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crearCel extends AppCompatActivity {

    private EditText precio, capRam, marca, color, sistemaOperativo;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cel);
        precio = (EditText) findViewById(R.id.txtPrecio);
        capRam = (EditText) findViewById(R.id.txtCapRam);
        marca = (EditText) findViewById(R.id.txtMarca);
        color = (EditText) findViewById(R.id.txtColor);
        sistemaOperativo = (EditText) findViewById(R.id.txtSistOpera);

        resources = this.getResources();

    }

    public void guardar(View view){
        String prec, capcRam, mark, colors, sistOper;
        prec = precio.getText().toString();
        capcRam = capRam.getText().toString();
        mark = marca.getText().toString();
        colors = color.getText().toString();
        sistOper = sistemaOperativo.getText().toString();

        Celular c = new Celular(prec, mark, colors,capcRam,sistOper);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }
    public void limpiar(View v){
        precio.setText("");
        capRam.setText("");
        marca.setText("");
        color.setText("");
        sistemaOperativo.setText("");

    }
}
