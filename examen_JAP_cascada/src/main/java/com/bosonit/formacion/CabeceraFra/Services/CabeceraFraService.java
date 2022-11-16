package com.bosonit.formacion.CabeceraFra.Services;

import com.bosonit.formacion.CabeceraFra.CabeceraFra;
import com.bosonit.formacion.Cliente.Cliente;

import java.io.FileNotFoundException;

public interface CabeceraFraService {

    void createCabeceraFra(CabeceraFra cabeceraFra);
    Cliente updateCabeceraFra(CabeceraFra cabeceraFra);
    Cliente getCabeceraFra(String id) throws FileNotFoundException;
    void deleteCabeceraFra(String id);
}
