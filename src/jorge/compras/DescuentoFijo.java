package jorge.compras;

public class DescuentoFijo extends Descuento {

      @Override
    public float getDescuento(float c) {
        return getValor();
    }

    @Override
    public float getValorFinal(float c) {
        return c-this.getValor();
    }
}
