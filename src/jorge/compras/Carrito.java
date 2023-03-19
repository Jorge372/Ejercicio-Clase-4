package jorge.compras;

import java.util.ArrayList;

public class Carrito {
    private Descuento descuento;
    private ArrayList<Producto> Productos;
    private float costoTotal;
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
            Productos.add(producto);
            costoTotal += producto.getPrecio();;
    }
    public void quitarProducto(Producto producto){
        Productos.add(producto);
        costoTotal -= producto.getPrecio();;
    }
    public float obtenerCostoFinal() throws CarritoPrecio0Exception, DescuentoMontoNegativoException {
        if (costoTotal==0){
            throw new CarritoPrecio0Exception();
        }
        else if (descuento.getValorFinal(costoTotal)<0) {
            throw new DescuentoMontoNegativoException();
        }
        return descuento.getValorFinal(costoTotal);
    }
}
