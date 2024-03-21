package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    menu();
    }



    /* PASOS A SEGUIR
    * 1.- CREACION DE UNA MATRIZ DE 7 FILAS Y 24 COLUMNAS REFIRIENDOSE A LAS 7 DIAS DE LA SEMEANA Y LAS 24
    * HORAS DE UN DIA (la matriz usa doubles )
    * 2.-CREAMOS UN MENU
    * 3.- RELLENAMOS LA MATRIZ USANDDO EL MATH.RANDOM PARA GENERAR LA SIMULACION DE DATOS
    * 3.5.- se crea un metodo para mostar la matriz en pantalla para verificar el funcionamiento del relleno
    * 4.- creamos un metodo que reccorra toda la matriz (con un for) para encontrar el "mayor sismo de la
    * semana
    * 5.- Usando el mismo sistema del paso 4 creamos el buscador de numeros >= 5 y el sms  */
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
        }
        System.out.println();
    }

    public static double mostrarMayor(double sismos[][]) {
        double numMayor = sismos[0][0];
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos.length; j++) {
                if (sismos[i][j] > numMayor){
                    numMayor = sismos[i][j];
                }
            }
        }
        return numMayor;
    }

    public static int mayoresCinco(double[][] sismos){
        int contador = 0;
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                if (sismos[i][j] >= 5){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void sms (double[][] sismos){
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                if (sismos[i][j] >= 7){
                    System.out.println("Alerta!!! se debe evacuar zona costera!");
                }
            }

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
            System.out.println("5.- Mostar Tablilla de sismos Semanales");
            System.out.println("6.- Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    rellenoSismos(sismos);
                    System.out.println("Datos Obtenidos Con EXITO");
                    break;
                case 2:
                    double numeroMayor = mostrarMayor(sismos);
                    System.out.println("El mayor sismo encontrado es: ");
                    System.out.printf("Valor: %.2f",numeroMayor);
                    System.out.println();
                    break;
                case 3:
                    int mayorA5 = mayoresCinco(sismos);
                    System.out.println("Contador de Sismos mayores o iguales A 5: "+ mayorA5);
                    break;
                case 4:
                    sms(sismos);
                    break;
                case 5:
                    mostrarSismos(sismos);
                    break;
                case 6:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("Opcion INVALIDA");
                    break;
            }
        } while (opcion != 8);

    }
}
