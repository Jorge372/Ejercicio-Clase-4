package jorge.compras;

public class CarritoPrecio0Exception extends Exception{
    public CarritoPrecio0Exception(){
        System.out.println("No se puede aplicar descuentos a un total de $0");
    }
}
