package cl.sence.daniel.ejercicios;

import java.util.*;

public class PuzzleJava {
    public static void main(String[] args) {
        // Prueba de los métodos
        PuzzleJava puzzle = new PuzzleJava();

        // Pregunta 1
        int[] array1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        System.out.println("Suma de todos los números: " + puzzle.sumAndGreaterThan10(array1));

        // Pregunta 2
        String[] array2 = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        System.out.println("Nombres con más de 5 caracteres: " + Arrays.toString(puzzle.shuffleAndFilterNames(array2)));

        // Pregunta 3
        puzzle.shuffleAlphabet();

        // Pregunta 4
        System.out.println("Números aleatorios entre 55 y 100: " + Arrays.toString(puzzle.generateRandomNumbers()));

        // Pregunta 5
        puzzle.generateAndSortRandomNumbers();

        // Pregunta 6
        System.out.println("Cadena aleatoria de 5 caracteres: " + puzzle.generateRandomString(5));

        // Pregunta 7
        System.out.println("Arreglo de 10 cadenas aleatorias de 5 caracteres: "
                + Arrays.toString(puzzle.generateRandomStrings(10, 5)));
    }

    public int sumAndGreaterThan10(int[] array) {
        int sum = 0;
        List<Integer> greaterThan10 = new ArrayList<>();

        for (int num : array) {
            sum += num;
            if (num > 10) {
                greaterThan10.add(num);
            }
        }

        System.out.println("Números mayores a 10: " + greaterThan10);
        return sum;
    }

    public String[] shuffleAndFilterNames(String[] names) {
        List<String> nameList = Arrays.asList(names);
        Collections.shuffle(nameList);

        List<String> filteredNames = new ArrayList<>();
        for (String name : nameList) {
            if (name.length() > 5) {
                filteredNames.add(name);
            }
        }

        return filteredNames.toArray(new String[0]);
    }

    public void shuffleAlphabet() {
        List<Character> alphabet = new ArrayList<>();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet.add(letter);
        }

        Collections.shuffle(alphabet);

        char firstLetter = alphabet.get(0);
        char lastLetter = alphabet.get(alphabet.size() - 1);

        System.out.println("Primera letra del alfabeto: " + firstLetter);
        System.out.println("Última letra del alfabeto: " + lastLetter);

        if (isVowel(firstLetter)) {
            System.out.println("La primera letra es una vocal.");
        }
    }

    private boolean isVowel(char letter) {
        return "AEIOUaeiou".indexOf(letter) != -1;
    }

    public int[] generateRandomNumbers() {
        Random random = new Random();
        int[] randomNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(46) + 55; // Rango entre 55 y 100
        }

        return randomNumbers;
    }

    public void generateAndSortRandomNumbers() {
        int[] randomNumbers = generateRandomNumbers();
        Arrays.sort(randomNumbers);

        System.out.println("Números aleatorios ordenados: " + Arrays.toString(randomNumbers));
        System.out.println("Valor mínimo: " + randomNumbers[0]);
        System.out.println("Valor máximo: " + randomNumbers[9]);
    }

    public String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    public String[] generateRandomStrings(int count, int length) {
        String[] randomStrings = new String[count];

        for (int i = 0; i < count; i++) {
            randomStrings[i] = generateRandomString(length);
        }

        return randomStrings;
    }
}
