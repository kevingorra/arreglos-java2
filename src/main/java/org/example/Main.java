package org.example;

import Calse.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=100;
        Scanner lea =new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[5];

        System.out.println("******Menu******");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Ver Estudiantes");
        System.out.println("3. Salir");
        while (opcion!=3){




            System.out.println("Digite una opcion : ");
            opcion= lea.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Selecciona la opcion 1: ");
                    for (int i=0;i< estudiantes.length;i++ ){

                        Estudiante prueba = new Estudiante();

                        System.out.println("Digite el nombre del  Estudiante: ");
                        prueba.setNombre(lea.next());
                        System.out.println("Digite La edad Del Estudiante: ");
                        prueba.setEdad(lea.nextInt());
                        estudiantes[i]=prueba;

                    }
                    break;

                case 2:
                    System.out.println("Selecciono la opcion 2: ");

                    for (int i=0;i< estudiantes.length;i++ ){


                        System.out.println("El nombre Del Primer Estudiante es : "+estudiantes[0].getNombre());
                        System.out.println("La edad del Primer Estudiante es : "+estudiantes[0].getEdad());
                        System.out.println("El nombre Del segundo Estudiante es : "+estudiantes[1].getNombre());
                        System.out.println("La edad del segundo Estudiante es : "+estudiantes[1].getEdad());
                        System.out.println("El nombre Del tercer Estudiante es : "+estudiantes[2].getNombre());
                        System.out.println("La edad del tercer Estudiante es : "+estudiantes[2].getEdad());
                        System.out.println("El nombre Del cuarto Estudiante es : "+estudiantes[3].getNombre());
                        System.out.println("La edad del cuarto Estudiante es : "+estudiantes[3].getEdad());
                        System.out.println("El nombre Del quinto Estudiante es : "+estudiantes[4].getNombre());
                        System.out.println("La edad del quinto Estudiante es : "+estudiantes[4].getEdad());


                    }
                    break;

                case 3:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Seleccione una opcion Valida: ");

            }

        }
    }
}