package jorge.compras;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> Productos;
    private float costoTotal;
    private static final int tamaño = 3;
    public Carrito(){
        Productos = new ArrayList<>();
        costoTotal=0;
    }
    public void agregarProducto(Producto producto){
        if (Productos.size()<tamaño) {
            Productos.add(producto);
            costoTotal += producto.getPrecio();
        }
        else
            System.out.println("El carrito esta lleno");
    }
    public float obtenerCostoFinal(){
        return costoTotal;
    }
}
