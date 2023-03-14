import jorge.compras.Carrito;
import jorge.compras.Persona;
import jorge.compras.Producto;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jorge", "Arbach", 2002,7,30);
        Carrito carrito1 = new Carrito();
        Producto producto1 = new Producto("Queso", 510.5);
        Producto producto2 = new Producto("Jamon", 400.2);
        Producto producto3 = new Producto("Pan", 200.4);

        persona1.agregarCarrito(carrito1);
        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto2);
        carrito1.agregarProducto(producto3);
        System.out.println(carrito1.obtenerCostoFinal());

    }
}