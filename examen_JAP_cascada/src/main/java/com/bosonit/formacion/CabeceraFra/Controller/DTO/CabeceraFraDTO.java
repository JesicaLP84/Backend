package com.bosonit.formacion.CabeceraFra.Controller.DTO;

import com.bosonit.formacion.CabeceraFra.CabeceraFra;
import lombok.Data;

import java.io.Serializable;

@Data
public class CabeceraFraDTO implements Serializable {

    int idCliente;
    private int ImporteFra;

    public  CabeceraFraDTO getCabeceraFra(CabeceraFra cabeceraFra){
//        this.setIdCliente(cabeceraFra.getIdCliente());
        this.setImporteFra((int) cabeceraFra.getImporteFra());
                return null;
    }


}
