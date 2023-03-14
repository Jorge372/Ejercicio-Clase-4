package jorge.compras;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private Carrito carrito;

    public Persona(String nombre, String appellido, int añoNac, int mesNac, int diaNac){
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = LocalDate.of(añoNac, mesNac, diaNac);
        this.carrito = null;

    }
    public void agregarCarrito(Carrito carrito){
        if (this.carrito==null)
            this.carrito = carrito;
        else
            System.out.println("Esta persona ya tiene un carrito");
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        if (fechaNac.getMonthValue()<=LocalDate.now().getMonthValue() &&
            fechaNac.getDayOfMonth()<=LocalDate.now().getDayOfMonth())
            return LocalDate.now().getYear()-fechaNac.getYear();
        else
            return LocalDate.now().getYear()-fechaNac.getYear()-1;
    }
}
