package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    menu();
    }

    public static double[][] crearMatriz(int filas, int columnas) {
        double[][] sismos = new double[filas][columnas];
        return sismos;
    }

    public static void rellenoSismos(double sismos[][]) {
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                sismos[i][j] = (double) (Math.random() * 9.9);
            }
        }
    }

    public static void mostrarSismos(double sismos[][]) {
        for (int i = 0; i < sismos.length; i++) {
            System.out.println();
            for (int j = 0; j < sismos[i].length; j++) {
                System.out.print("|" + sismos[i][j] + "|");
            }
            System.out.println();
        }
    }


    public static void menu (){
        double[][] sismos = crearMatriz(7, 24);

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1.- Ingresar Datos");
            System.out.println("2.- Mostrar sismo de mayor magnitud");
            System.out.println("3.- Contar sismos mayores o iguales a 5.0");
            System.out.println("4.- Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5.- Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    rellenoSismos(sismos);
                    System.out.println("Datos Obtenidos Con EXITO");
                    break;
                case 2:
                    mostrarSismos(sismos);
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("Opcion INVALIDA");
                    break;
            }
        } while (opcion != 7);

    }
}
