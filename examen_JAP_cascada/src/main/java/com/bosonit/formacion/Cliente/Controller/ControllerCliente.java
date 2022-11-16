package com.bosonit.formacion.Cliente.Controller;

import com.bosonit.formacion.Cliente.Cliente;
import com.bosonit.formacion.Cliente.Services.ClienteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerCliente {

    @Autowired
    ClienteServiceImp clienteService;

    @PostMapping("/nuevoCliente")
    public String setCliente(@RequestBody Cliente cliente){

        cliente.setNombreCliente(cliente.getNombreCliente());

        clienteService.createCliente(cliente);

        return "El cliente ha sido creado correctamente" ;
    }
}
