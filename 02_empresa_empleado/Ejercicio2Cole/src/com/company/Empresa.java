package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String anyofundacion;

    public Empresa(String nombre, String anyofundacion) {
        this.nombre = nombre;
        this.anyofundacion = anyofundacion;
    }

    private List<Empleado> empleadoList = new ArrayList<>();

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyofundacion() {
        return anyofundacion;
    }

    public void setAnyofundacion(String anyofundacion) {
        this.anyofundacion = anyofundacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyofundacion='" + anyofundacion + '\'' +
                '}';
    }
}
