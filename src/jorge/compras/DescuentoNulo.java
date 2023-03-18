package jorge.compras;

public class DescuentoNulo extends Descuento{
    @Override
    public float getDescuento(float c) {
        return 0;
    }

    @Override
    public float getValorFinal(float c) {
        return 0;
    }
}
