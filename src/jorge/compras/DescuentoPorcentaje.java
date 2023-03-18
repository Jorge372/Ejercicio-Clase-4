package jorge.compras;

public class DescuentoPorcentaje extends Descuento{
    @Override
    public float getDescuento(float c) {
        return c*getValor();
    }

    @Override
    public float getValorFinal(float c) {
        return c-getDescuento(c);
    }
}
