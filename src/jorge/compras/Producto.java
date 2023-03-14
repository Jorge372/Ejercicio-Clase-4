package jorge.compras;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private Double precio;
    private Integer peso;
    private String descripcion;
    private LocalDate fechaAlta;

    public Producto (String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.fechaAlta =  LocalDate.now();

    }

    public Double getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getPeso() {
        return this.peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }
}
