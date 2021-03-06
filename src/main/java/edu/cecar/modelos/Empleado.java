/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Clase: Empleado
 * 
 * @version: 0.1
 *  
 * @since: 12/08/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Carlos Beltrán Guzmán
 * 
 * Copyrigth: CECAR
 */

package edu.cecar.modelos;
/**
 *
 * Clase que modela la estructura empleados
 */
public class Empleado {
    private String codigo, nombres, apellidos;
    private String FechaNacimiento;

    public Empleado(String codigo, String nombres, String apellidos, String FechaNacimiento) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Empleado() {
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
}
