package com.bosonit.formacion.CabeceraFra.Controller;

import com.bosonit.formacion.CabeceraFra.CabeceraFra;
import com.bosonit.formacion.CabeceraFra.Services.CabeceraFraImp;
import com.bosonit.formacion.Cliente.Cliente;
import com.bosonit.formacion.Cliente.Services.ClienteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerCabeceraFra {

    @Autowired
    CabeceraFraImp cabeceraFraService;
    @Autowired
    ClienteServiceImp clienteService;

    @PostMapping("/nuevaFactura")
    public String setCabeceraFra(@RequestBody CabeceraFra cabeceraFra){

//        cabeceraFra.setIdCliente(cabeceraFra.getIdCliente());
        cabeceraFra.setImporteFra(cabeceraFra.getImporteFra());

        cabeceraFraService.createCabeceraFra(cabeceraFra);

        return "La factura ha sido creada correctamente" ;
    }

}
