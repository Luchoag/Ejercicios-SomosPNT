package ar.com.somospnt;
import java.util.ArrayList;

public class Gaseosa extends Producto{
   
    private float litros;

    public Gaseosa(float litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: "+ litros + " /// Precio: $" + getPrecio();
    }
    
}
