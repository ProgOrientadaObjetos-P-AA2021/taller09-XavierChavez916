/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoMeses;
    protected String ciudad;
    
    public Prestamo(Persona bene, int mes, String ciu){
        beneficiario = bene;
        tiempoMeses = mes;
        ciudad = ciu;
    }
    
    public void establecerBeneficiario(Persona n){
        beneficiario = n;
    }
    
    public void establecerTiempoMeses(int n){
        tiempoMeses = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public int obtenerTiempoMeses(){
        return tiempoMeses;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Beneficiario\n\tNombre: %s\n"
                + "\tApellido: %s\nTiempo de prestamo en meses: %d\nCiudad: %s\n",
                beneficiario.obtenerNombre(),beneficiario.obtenerApellido(),
                tiempoMeses, ciudad); 
        return cadena;
    }
}
