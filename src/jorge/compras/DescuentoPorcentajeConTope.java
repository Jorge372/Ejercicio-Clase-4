package jorge.compras;

public class DescuentoPorcentajeConTope extends Descuento{

    @Override
    public float getDescuento(float c) {
        if (c*getValor()>500){
            return 500;
        }
        else
        return c*getValor();
    }

    @Override
    public float getValorFinal(float c) {
        return c-getDescuento(c);
    }
}
