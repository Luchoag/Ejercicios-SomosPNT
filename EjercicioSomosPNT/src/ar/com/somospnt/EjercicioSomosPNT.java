package ar.com.somospnt;

import static ar.com.somospnt.Producto.compararPrecio;
import static ar.com.somospnt.Producto.imprimirInfo;
import java.util.ArrayList;
import java.util.Collections;

public class EjercicioSomosPNT {

    public static void main(String[] args) {
       
        Producto cocaZero = new Gaseosa(1.5f, "Coca-Cola Zero", 20);
        Producto cocaCola = new Gaseosa(1.5f, "Coca-Cola", 18);
        Producto frutillas = new Fruta("kilo", "Frutillas", 64);
        Producto shampooSedal = new Limpieza(500, "Shampoo Sedal", 19);
        
        cocaZero.cargarProducto(cocaZero);
        cocaCola.cargarProducto(cocaCola);
        shampooSedal.cargarProducto(shampooSedal);
        frutillas.cargarProducto(frutillas);
        
        imprimirInfo();
        System.out.println("=============================");
        compararPrecio();
        
    }   
    
}
