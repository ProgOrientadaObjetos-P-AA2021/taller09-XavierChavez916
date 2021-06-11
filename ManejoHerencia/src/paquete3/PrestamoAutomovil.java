/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(Persona bene, int mes, String ciu, String tip,
            String mar, Persona gar, double valAut) {
        super(bene, mes, ciu);
        establecerCiudad(ciu);
        tipoAutomovil = tip;
        marcaAutomovil = mar;
        garante = gar;
        valorAutomovil = valAut;
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toLowerCase();
    }

    public void establecerTipoAutomovil(String n) {
        tipoAutomovil = n;
    }

    public void establecerMarcaAutomovil(String n) {
        marcaAutomovil = n;
    }

    public void establecerGarante(Persona n) {
        garante = n;
    }

    public void establecerValorAutomovil(double n) {
        valorAutomovil = n;
    }

    public void establecerValorMensualAutomovil() {
        valorMensualAutomovil = valorAutomovil / tiempoMeses;;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    @Override
    public String toString() {
        String cadena = String.format("======================================\n"
                + "%s", super.toString());
        cadena = String.format("%s\nTipo automovil: %s\nMarcaAutomovil: %s\n"
                + "Garante\n\tNombre: %s\n\tApellido: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual Automovil: %.2f\n"
                + "======================================\n", cadena,
                tipoAutomovil, marcaAutomovil,
                garante.obtenerNombre(), garante.obtenerApellido(),
                valorAutomovil, valorMensualAutomovil);

        return cadena;
    }

}
