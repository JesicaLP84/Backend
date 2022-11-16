package com.bosonit.formacion.Cliente.Services;

import com.bosonit.formacion.Cliente.Repository.ClienteRepository;
import com.bosonit.formacion.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public void createCliente(Cliente cliente) {

        Cliente cliente1 = new Cliente();
        clienteRepository.save(cliente);

    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente getCliente(String id) throws FileNotFoundException {
        return null;
    }

    @Override
    public void deleteCliente(String id) {

    }
}
