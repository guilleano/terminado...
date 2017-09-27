package com.example.android.tallertabletlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Celular extends AppCompatActivity {

    private String precio;
    private String marca;
    private String color;
    private String capRam;
    private String sistOperativo;

    public Celular(String precio, String marca, String color, String capRam, String sistOperativo) {
        this.precio = precio;
        this.marca = marca;
        this.color = color;
        this.capRam = capRam;
        this.sistOperativo = sistOperativo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapRam() {
        return capRam;
    }

    public void setCapRam(String capRam) {
        this.capRam = capRam;
    }

    public String getSistOperativo() {
        return sistOperativo;
    }

    public void setSistOperativo(String sistOperativo) {
        this.sistOperativo = sistOperativo;
    }

    public  void  guardar(){
        Datos.guardar(this);
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);
    }*/
}
