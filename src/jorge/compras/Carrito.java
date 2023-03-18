package jorge.compras;

import java.util.ArrayList;

public class Carrito {
    private Descuento descuento;
    private ArrayList<Producto> Productos;
    private float costoTotal;
    private static final int tamaño = 3;
    public Carrito(){
        Productos = new ArrayList<>();
        descuento = new DescuentoNulo();
        costoTotal=0;
    }


    public void setDescuento(Descuento d){
        descuento=d;
    }
    public Descuento getDescuento() {
        return descuento;
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

        return descuento.getValorFinal(costoTotal);
    }
}
