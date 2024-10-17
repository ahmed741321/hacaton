package com.example.userauthapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ambitoNombre;
    private String embalseNombre;
    private double aguaTotal;
    private Long electricoFlag;
    private Long codigo;
    private String nombre;
    private String embalse;
    private double x;
    private double y;
    private String demarc;
    private String provincia;
    private String ccaa;
    private String tipo;
    private String informe;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAmbitoNombre() { return ambitoNombre; }
    public void setAmbitoNombre(String ambitoNombre) { this.ambitoNombre = ambitoNombre; }

    public String getEmbalseNombre() { return embalseNombre; }
    public void setEmbalseNombre(String embalseNombre) { this.embalseNombre = embalseNombre; }

    public double getAguaTotal() { return aguaTotal; }
    public void setAguaTotal(double aguaTotal) { this.aguaTotal = aguaTotal; }

    public Long getElectricoFlag() { return electricoFlag; }
    public void setElectricoFlag(Long electricoFlag) { this.electricoFlag = electricoFlag; }

    public Long getCodigo() { return codigo; }
    public void setCodigo(Long codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmbalse() { return embalse; }
    public void setEmbalse(String embalse) { this.embalse = embalse; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public String getDemarc() { return demarc; }
    public void setDemarc(String demarc) { this.demarc = demarc; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getCcaa() { return ccaa; }
    public void setCcaa(String ccaa) { this.ccaa = ccaa; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getInforme() { return informe; }
    public void setInforme(String informe) { this.informe = informe; }
}
