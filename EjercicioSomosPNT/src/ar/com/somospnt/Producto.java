package ar.com.somospnt;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Producto implements Comparable<Producto>{
    
    //Variables
    static ArrayList<Producto> productos = new ArrayList<>();
    private String nombre;
    private int precio;
    
    //Constructor
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    //Métodos
    public void cargarProducto (Producto prod) {
        productos.add(prod);
    }
    
    public static void imprimirInfo() {
        productos.forEach(i -> System.out.println(i));
    }
    
    public static void compararPrecio () {
        Collections.sort(productos);
        Producto mayorPrecio=(Producto) productos.get(0);
        Producto menorPrecio=(Producto) productos.get(productos.size()-1);
        System.out.println("Producto más caro: "+ mayorPrecio.getNombre());
        System.out.println("Producto más barato: "+ menorPrecio.getNombre());
    }
    
    @Override
    public int compareTo (Producto producto) {
        return producto.precio - this.precio;
    }
    
}
