package ar.com.somospnt;

import java.util.ArrayList;

public class Limpieza extends Producto{

    private int contenido;

    public Limpieza(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: "+ contenido + "ml /// Precio: $" + getPrecio();
    }

    
}
