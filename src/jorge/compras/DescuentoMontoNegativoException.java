package jorge.compras;

public class DescuentoMontoNegativoException extends Exception{
    public DescuentoMontoNegativoException (){
        System.out.println("El importe total no es suficiente para aplicar el descuento");
    }
}
