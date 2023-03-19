import jorge.compras.*;

public class Main {
    //DEBE AGREGAR UN PARAMETRO (F, %, o %F) ANTES DE CORRER EL PROGRAMA
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jorge", "Arbach", 2002,7,30);
        Carrito carrito1 = new Carrito();
        Producto producto1 = new Producto("Queso", 0.0);
        Producto producto2 = new Producto("Jamon", 0.0);
        Producto producto3 = new Producto("Pan", 10.0);


        Descuento descuento = switch (args[0]) {
            case "F" -> new DescuentoFijo();
            case "%" -> new DescuentoPorcentaje();
            case "%F" -> new DescuentoPorcentajeConTope();
            default -> new DescuentoNulo();
        };

        float d = switch (args[0]) {
            case "F" -> 650;
            case "%" -> 0.4F;
            case "%F" -> 0.5F;
            default -> 0;
        };


        persona1.agregarCarrito(carrito1);
        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto2);
        carrito1.agregarProducto(producto3);
        descuento.setValor(d);
        carrito1.setDescuento(descuento);

        try {
            System.out.println("El precio final a pagar del carrito es: $"+carrito1.obtenerCostoFinal());
        }
        catch (CarritoPrecio0Exception e){
            System.out.println(e.getMessage());
        }
        catch (DescuentoMontoNegativoException e){
            System.out.println(e.getMessage());
        }


    }
}
