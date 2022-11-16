package com.bosonit.formacion.CabeceraFra;

import com.bosonit.formacion.Cliente.Cliente;
import com.bosonit.formacion.LineasFra.LineasFra;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CabeceraFra")
public class CabeceraFra implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) // no hace falta colocarlo ya que indicamos @Entity
    @Column(name = "idCabeFra", nullable = false)
    int idCabeFra;

    //ESTO NO ES NECESARIO YA QUE SE ESTABLECE ENLACE DEL ID DEL CLIENTE GENERADO Y ES EL QUE SE AÑADE EN CABECERAFRA
//    @NotNull
//    @Column(name = "cli_codi")// si queremos indicar un nombre diferente a la variable, si lo indicamos. Si no, JPA lo ejecuta directamente
//    private int cli_codi;

    @NotNull
    @Column(name = "ImportFra")
    double ImporteFra;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    Cliente idCliente;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="lineasFra")
    List<LineasFra> lineasFra;

    public int idCabeFra() {
        return idCabeFra;
    }

    public double ImporteFra() {
        return ImporteFra;
    }






    public void setIdCliente(int idCliente) {
    }
}
