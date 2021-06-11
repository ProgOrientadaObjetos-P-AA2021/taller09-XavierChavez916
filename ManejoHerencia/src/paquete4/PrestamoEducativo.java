/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private String centroEducativo;
    private double valorCarrera;
    private double valorMensualCarrera;

    public PrestamoEducativo(Persona bene, int mes, String ciu, String nivel,
            String centro, double valCarr) {
        super(bene, mes, ciu);
        establecerCiudad(ciu);
        nivelEstudio = nivel;
        centroEducativo = centro;
        valorCarrera = valCarr;

    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toUpperCase();
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducatico(String n) {
        centroEducativo = n;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public void establecerValorMensualCarrera() {
        valorMensualCarrera = (valorCarrera / tiempoMeses)
                - (0.1 * (valorCarrera / tiempoMeses));
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public String obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualCarrera() {
        return valorMensualCarrera;
    }

    @Override
    public String toString() {
        String cadena = String.format("======================================\n"
                + "%s", super.toString());
        cadena = String.format("%s\nNivel de estudio: %s\n"
                + "Centro Educatico: %s\nValor Carrera: %.2f\n"
                + "Valor Mensual Carrera: %.2f\n"
                + "======================================\n", cadena,
                nivelEstudio, centroEducativo, valorCarrera,
                valorMensualCarrera);
        return cadena;
    }

}
