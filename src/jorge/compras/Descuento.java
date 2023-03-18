package jorge.compras;

public abstract class Descuento {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float v){
        valor=v;
    }

    public abstract float getDescuento (float c);

    public abstract float getValorFinal (float c);
}
