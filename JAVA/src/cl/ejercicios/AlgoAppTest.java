package cl.ejercicios;

public class AlgoAppTest {

    public static void main(String[] args) {
        AlgoApp algo = new AlgoApp();

        algo.sumar();
        algo.imprimir1_255();
        algo.imprimirImpares1_255();
        algo.recorrerArreglo(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        algo.encontrarMax(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        algo.promedio(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        algo.arregloImpares();

    }

}
