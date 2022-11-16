package com.bosonit.formacion.Cliente.Controller.DTO;

import com.bosonit.formacion.Cliente.Cliente;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteDTO implements Serializable {

    private String nombreCliente;

    public ClienteDTO getCliente(Cliente cliente){

        this.setNombreCliente(cliente.getNombreCliente());
        return null;
    }
}
