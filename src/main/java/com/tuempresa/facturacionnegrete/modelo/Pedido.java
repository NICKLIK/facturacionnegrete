package com.tuempresa.facturacionnegrete.modelo;
 
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@View( extendsView="super.DEFAULT", 
members="factura { factura } "
)
@View( name="SinClienteNiFactura", 
members=                       
    "anyo, numero, fecha;" +   
    "detalles;" +
    "observaciones"
)

@Entity @Getter @Setter
public class Pedido extends DocumentoComercial {

    @ManyToOne
    @ReferenceView("SinClienteNiPedidos")
    Factura factura; 
 
}