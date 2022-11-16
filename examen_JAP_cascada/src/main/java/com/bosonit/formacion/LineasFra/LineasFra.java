package com.bosonit.formacion.LineasFra;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "LineasFra")
public class LineasFra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;


    //NO es necesario indicar sta columna ya que al hacer el join lo coge de la Factura, ya esta generado en la cabeceraFra
    @NotNull
    @Column
    private int IdFra;

    @NotNull
    @Column
    private String ProNomb;

    @NotNull
    @Column
    private double Cantidad;

    @NotNull
    @Column
    private double Precio;


    public int IdFra() {
        return IdFra;
    }

    public void setIdFra(int idFra) {
        IdFra = idFra;
    }

    public String ProNomb() {
        return ProNomb;
    }

    public void setProNomb(String proNomb) {
        ProNomb = proNomb;
    }

    public double Cantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = Double.parseDouble(cantidad);
    }

    public double Precio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = Double.parseDouble(precio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
