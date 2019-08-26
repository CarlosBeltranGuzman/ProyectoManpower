/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;

import edu.cecar.controladores.ControladorEmpleado;
import edu.cecar.modelos.Empleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1102888499
 */
public class TestControladorEmpleado {
    
     
    @Test
    public void testConexionBaseDatos(){
        try {
            ControladorEmpleado controladorEmpleado= new ControladorEmpleado();
            System.out.println("Conexion Exitosa ;)");
        } catch (Exception ex) {
            fail("Error de Conexion");
            Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testGuardar(){
        try {
            Empleado empleado = new Empleado("9908240724", "Daniel", "Guzman", "1998-08-24");
            ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
            controladorEmpleado.guardar(empleado);
            Empleado empleadoBaseDatos = controladorEmpleado.consultar(empleado.getCodigo());
            
            assertEquals("El codigo esperado no coincide con el insertado", empleado.getCodigo(), empleadoBaseDatos.getCodigo());
            assertEquals("El nombre esperado no coincide con el insertado", empleado.getNombres(), empleadoBaseDatos.getNombres());
            assertEquals("El apellido esperado no coincide con el insertado", empleado.getApellidos(), empleadoBaseDatos.getApellidos());
            assertEquals("El Fecha Nacimiento esperada no coincide con la insertada", empleado.getFechaNacimiento(), empleadoBaseDatos.getFechaNacimiento());
            
        } catch (SQLException ex) {
            Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testActualizar(){
        try {
            Empleado empleado = new Empleado("9908240724", "Dani", "Guzman", "1998-08-24");
            ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
            controladorEmpleado.guardar(empleado);
            Empleado empleadoBaseDatos = controladorEmpleado.consultar(empleado.getCodigo());
            
            assertEquals("El codigo esperado no coincide con el insertado", empleado.getCodigo(), empleadoBaseDatos.getCodigo());
            assertEquals("El nombre esperado no coincide con el insertado", empleado.getNombres(), empleadoBaseDatos.getNombres());
            assertEquals("El apellido esperado no coincide con el insertado", empleado.getApellidos(), empleadoBaseDatos.getApellidos());
            assertEquals("El Fecha Nacimiento esperada no coincide con la insertada", empleado.getFechaNacimiento(), empleadoBaseDatos.getFechaNacimiento());
            
        } catch (SQLException ex) {
            Logger.getLogger(TestControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    
//    @Test
//    public void testEliminar(){
//        
//    }
//    
    
    
    
    
    
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
