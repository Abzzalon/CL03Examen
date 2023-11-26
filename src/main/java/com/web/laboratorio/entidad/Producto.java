package com.web.laboratorio.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDPRODUCTOCL3;
    private String NOMBRECL3;
    private Double PRECIOVENTACL3;
    private Integer STOCK;
    private Double PRECIOCOMPCL3;
    private String ESTADOCL3;
    private String DESCRIPCL3;

    public Integer getIDPRODUCTOCL3() {
        return IDPRODUCTOCL3;
    }

    public void setIDPRODUCTOCL3(Integer IDPRODUCTOCL3) {
        this.IDPRODUCTOCL3 = IDPRODUCTOCL3;
    }

    public String getNOMBRECL3() {
        return NOMBRECL3;
    }

    public void setNOMBRECL3(String NOMBRECL3) {
        this.NOMBRECL3 = NOMBRECL3;
    }

    public Double getPRECIOVENTACL3() {
        return PRECIOVENTACL3;
    }

    public void setPRECIOVENTACL3(Double PRECIOVENTACL3) {
        this.PRECIOVENTACL3 = PRECIOVENTACL3;
    }

    public Integer getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(Integer STOCK) {
        this.STOCK = STOCK;
    }

    public Double getPRECIOCOMPCL3() {
        return PRECIOCOMPCL3;
    }

    public void setPRECIOCOMPCL3(Double PRECIOCOMPCL3) {
        this.PRECIOCOMPCL3 = PRECIOCOMPCL3;
    }

    public String getESTADOCL3() {
        return ESTADOCL3;
    }

    public void setESTADOCL3(String ESTADOCL3) {
        this.ESTADOCL3 = ESTADOCL3;
    }

    public String getDESCRIPCL3() {
        return DESCRIPCL3;
    }

    public void setDESCRIPCL3(String DESCRIPCL3) {
        this.DESCRIPCL3 = DESCRIPCL3;
    }
}
