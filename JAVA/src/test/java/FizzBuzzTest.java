import cl.sence.daniel.ejercicios.FizzBuzz;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzz fb = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fb.fizzBuzz(i));
        }
    }
}
