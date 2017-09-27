package com.example.android.tallertabletlayout;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class Datos {

    private static ArrayList<Celular> celulars=new ArrayList<>();


    public static void guardar(Celular c){
        celulars.add(c);

    }

    public static ArrayList<Celular> obtener(){
        return celulars;
    }

}
