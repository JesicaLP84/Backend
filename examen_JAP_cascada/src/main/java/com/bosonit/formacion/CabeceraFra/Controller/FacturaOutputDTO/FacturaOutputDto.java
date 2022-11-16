package com.bosonit.formacion.CabeceraFra.Controller.FacturaOutputDTO;

import com.bosonit.formacion.Cliente.Controller.ClienteOutputDTO.ClienteOutputDto;
import com.bosonit.formacion.LineasFra.Controller.LineaOutputDTO.LineaOutputDto;

import java.util.List;

public class FacturaOutputDto {

    int id;
    double importeFra=0;

    ClienteOutputDto clienteOutputDto;

    List<LineaOutputDto> lineaOutputDtoList;
}
