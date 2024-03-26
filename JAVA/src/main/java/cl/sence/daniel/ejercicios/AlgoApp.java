package cl.sence.daniel.ejercicios;

public class AlgoApp {
    // imprimir 1 - 255
    public int imprimir1_255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
        return 0;
    }

    public int imprimirImpares1_255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        return 0;
    }

    public int sumar() {
        int suma = 0;

        for (int i = 0; i <= 255; i++) {

            suma += i;
            System.out.println("Nuevo numero: " + i + " Suma: " + suma);
        }
        return suma;

    }

    public int recorrerArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        return 0;
    }

    public int encontrarMax(int[] arreglo) {
        int max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        return max;
    }

    public int promedio(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public int arregloImpares() {
        int[] arreglo = new int[128];
        int j = 0;
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                arreglo[j] = i;
                j++;
            }
        }
        return 0;
    }

    public int mayorQueY(int[] arreglo, int y) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > y) {
                contador++;
            }
        }
        return contador;
    }

    public int elevarAlCuadrado(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * arreglo[i];
        }
        return 0;
    }

    public int eliminarNegativos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0) {
                arreglo[i] = 0;
            }
        }
        return 0;
    }

    public int maxMinProm(int[] arreglo) {
        int max = arreglo[0];
        int min = arreglo[0];
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
            suma += arreglo[i];
        }
        System.out.println("Maximo: " + max + " Minimo: " + min + " Promedio: " + suma / arreglo.length);
        return 0;
    }

    public int cambiarValores(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[arreglo.length - 1] = 0;
        return 0;
    }
}
