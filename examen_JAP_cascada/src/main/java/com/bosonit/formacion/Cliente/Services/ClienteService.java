package com.bosonit.formacion.Cliente.Services;

import com.bosonit.formacion.Cliente.Cliente;

import java.io.FileNotFoundException;

public interface ClienteService {

    void createCliente(Cliente cliente);
    Cliente updateCliente(Cliente cliente);
    Cliente getCliente(String id) throws FileNotFoundException;
    void deleteCliente(String id);


}
