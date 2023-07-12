/*
En un nuevo proyecto, en el método main de su clase principal, se pide realizar un algoritmo
que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.

¿Cómo es la transpuesta de una matriz?
 */
package guia5ejer4;

import java.util.Random;


public class Guia5Ejer4 {

 public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Rellenar la matriz con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Rango de valores de 0 a 99
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcular la traspuesta de la matriz
        int[][] traspuesta = obtenerTraspuesta(matriz);

        // Mostrar la traspuesta de la matriz
        System.out.println("Traspuesta:");
        mostrarMatriz(traspuesta);
    }

    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para obtener la traspuesta de una matriz
    public static int[][] obtenerTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}
