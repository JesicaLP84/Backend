package com.bosonit.formacion.LineasFra.Services;

import com.bosonit.formacion.Cliente.Cliente;
import com.bosonit.formacion.LineasFra.LineasFra;

import java.io.FileNotFoundException;

public interface LineasFraService {

    void createLineasFra(LineasFra lineasFra);
    Cliente updateLineasFra(LineasFra lineasFra);
    Cliente getLineasFra(String id) throws FileNotFoundException;
    void deleteLineasFra(String id);

}
