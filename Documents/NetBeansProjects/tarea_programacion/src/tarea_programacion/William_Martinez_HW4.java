package tarea_programacion;

import java.util.Scanner;
import java.util.Random;

public class William_Martinez_HW4 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        Random rand= new Random();
        
        int[][] arregloMult;
        int  sumaDiagPrincipal=0, sumaDiagSecundaria=0, numCont=0;
/*
        Hacer un arreglo bidimensional cuadrado de dimensiones N x N, donde N es el número de 
        filas y columnas ingresada desde el teclado, luego de crear el arreglo se necesita cargar en las posiciones valores 
        numéricos de manera aleatoria con la restricción de solo permitir todos los números que contiene solo dos dígitos, 
        además, realizar las siguientes operaciones y mostrar en pantalla el arreglo(Formato de estilo matriz) y la suma:
        */

        System.out.println("Ingrese la cantidad de filas y columnas que quiere en el arreglo : ");
        int numArreglo=lea.nextInt();
        
        while(numArreglo<=0){
            System.out.println("Error. Ingrese la cantidad de filas y columnas que quiere en el arreglo : ");
            numArreglo=lea.nextInt();
        }
        arregloMult = new int[numArreglo][numArreglo];
        /*
        1. Suma de la Diagonal Principal: La diagonal principal se extiende desde la esquina superior izquierda hasta la esquina inferior derecha.
        primera = suma variable fila
        segunda = suma variable columna
        2. Suma de la Diagonal Secundaria: La diagonal secundaria se extiende desde la esquina superior derecha hasta la esquina inferior izquierda.
        */
        for (int filas = 0; filas < numArreglo; filas++) {
            for (int columnas = 0; columnas < numArreglo ; columnas++) {
                int numero = rand.nextInt(90) + 10;
                arregloMult[filas][columnas]=numero;
                System.out.print(arregloMult[filas][columnas]+" ");
                
            }
            System.out.println("");
        }
        numCont=numArreglo;
        for (int coordsPincipal = 0; coordsPincipal < numArreglo; coordsPincipal++) {
            sumaDiagPrincipal+=arregloMult[coordsPincipal][coordsPincipal];
            
        }
        System.out.println("La suma total de la diagonal principal: "+sumaDiagPrincipal);
        for (int coordsSecundaria = 0; coordsSecundaria < numArreglo; coordsSecundaria++) {
            sumaDiagSecundaria+=arregloMult[coordsSecundaria][numCont-1];
            numCont-=1;
        }
        System.out.println("La suma total de la diagonal secundaria: "+sumaDiagSecundaria);
    }
}
