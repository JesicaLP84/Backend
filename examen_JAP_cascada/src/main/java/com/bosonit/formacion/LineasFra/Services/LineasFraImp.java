package com.bosonit.formacion.LineasFra.Services;

import com.bosonit.formacion.Cliente.Cliente;
import com.bosonit.formacion.LineasFra.LineasFra;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class LineasFraImp implements LineasFraService {
    @Override
    public void createLineasFra(LineasFra lineasFra) {

    }

    @Override
    public Cliente updateLineasFra(LineasFra lineasFra) {
        return null;
    }

    @Override
    public Cliente getLineasFra(String id) throws FileNotFoundException {
        return null;
    }

    @Override
    public void deleteLineasFra(String id) {

    }
}
