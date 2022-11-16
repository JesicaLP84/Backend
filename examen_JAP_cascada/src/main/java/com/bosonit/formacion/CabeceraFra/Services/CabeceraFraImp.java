package com.bosonit.formacion.CabeceraFra.Services;

import com.bosonit.formacion.CabeceraFra.CabeceraFra;
import com.bosonit.formacion.CabeceraFra.Repository.CabeceraFraRepository;
import com.bosonit.formacion.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class CabeceraFraImp implements CabeceraFraService {

    @Autowired
    private CabeceraFraRepository cabeceraFraRepository;

    @Override
    public void createCabeceraFra(CabeceraFra cabeceraFra) {
        CabeceraFra cabeceraFra1 = new CabeceraFra();
        cabeceraFraRepository.save(cabeceraFra);
    }

    @Override
    public Cliente updateCabeceraFra(CabeceraFra cabeceraFra) {
        return null;
    }

    @Override
    public Cliente getCabeceraFra(String id) throws FileNotFoundException {
        return null;
    }

    @Override
    public void deleteCabeceraFra(String id) {

    }
}
