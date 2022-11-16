package com.bosonit.formacion.Cliente;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Crea el Id autoincremental
    int idCliente;

    @Column(length = 100)
    @NotNull
    private String nombreCliente;


    //Genero los Getters y Setters automáticamente
    public int id() {
        return idCliente;
    }

//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }

    public String nombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public void cliente(String nombreCliente){
        String nombreCliente1 = this.nombreCliente;
    }
}
