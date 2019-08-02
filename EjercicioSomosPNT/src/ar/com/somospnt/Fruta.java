package ar.com.somospnt;

import java.util.ArrayList;

public class Fruta extends Producto{
    
    private String unidadDeVenta;

    public Fruta(String unidadDeVenta, String nombre, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + unidadDeVenta;
    }
    
    
    
}
