/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author:
 *          Xavier Alexander Chávez Saraguro
 *          Michael Eduardo Maldonado Pereira
 */         
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int opcion, meses;
        String nom, apell, tipAut, marAut, ciudad;
        double valor, valCar;
        while (bandera) {
            System.out.println("================================================");
            System.out.println("Ingrese 1 si desea un Prestamo de tipo Automovil\n"
                    + "Ingrese 2 si desea un Prestamo de tipo Educativo");
            System.out.println("================================================");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1 || opcion == 2) {
                System.out.println("--------------------------------------");
                System.out.println("\tDatos del beneficiario");
                System.out.println("--------------------------------------");
                System.out.println("Ingrese el nombre");
                nom = entrada.nextLine();
                System.out.println("Ingrese el apellido");
                apell = entrada.nextLine();
                System.out.println("--------------------------------------");
                System.out.println("---------------PRESTAMO---------------");
                System.out.println("Ingrese el tiempo de prestamo en meses");
                meses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad donde hace el prestamo");
                ciudad = entrada.nextLine();
                Persona p1 = new Persona(nom, apell);
                System.out.println("--------------------------------------");
                if (opcion == 1) {
                    System.out.println("----------PRESTAMO AUTOMOVIL----------");
                    System.out.println("Ingrese el tipo de automovil");
                    tipAut = entrada.nextLine();
                    System.out.println("Ingrese la marca del automovil");
                    marAut = entrada.nextLine();
                    System.out.println("--------------------------------------");
                    System.out.println("\tDatos del garante");
                    System.out.println("--------------------------------------");
                    System.out.println("Ingrese el nombre");
                    String nom2 = entrada.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apell2 = entrada.nextLine();
                    Persona p2 = new Persona(nom2, apell2);
                    System.out.println("Ingrese el valor del automovil");
                    valor = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoAutomovil pa = new PrestamoAutomovil(p1, meses,
                            ciudad, tipAut, marAut, p2, valor);
                    pa.establecerValorMensualAutomovil();
                    System.out.println(pa);
                } else {
                    System.out.println("----------PRESTAMO ESTUDIANTIL--------");
                    System.out.println("Ingrese el nivel de estudio");
                    String nivel = entrada.nextLine();
                    System.out.println("Ingrese el nombre del centro educativo");
                    String centro = entrada.nextLine();
                    System.out.println("Ingrese el valor de la carrera");
                    valCar = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoEducativo pe = new PrestamoEducativo(p1,
                            meses, ciudad, nivel, centro, valCar);
                    pe.establecerValorMensualCarrera();
                    System.out.println(pe);
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("La opcion que ingresaste es incorrecta");
                System.out.println("--------------------------------------");
            }

            System.out.println("Digite si para ingresar datos\n"
                    + "Digite no para salir del ciclo");
            String ap = entrada.nextLine();
            if (ap.toLowerCase().equals("si")) {
                bandera = true;
            } else if (ap.toLowerCase().equals("no")) {
                bandera = false;
            }

        }

    }

}
