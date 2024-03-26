import cl.sence.daniel.ejercicios.StringManipulator;

public class StringManipulatorTest {

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ", "     World    ");
        System.out.println(str); // HelloWorld

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        int a = manipulator2.getIndexOrNull("Coding", letter);
        int b = manipulator2.getIndexOrNull("Hello World", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4

        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer c = manipulator3.getIndexOrNull(word, subString);
        Integer d = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(c); // 2
        System.out.println(d); // null

        StringManipulator manipulator4 = new StringManipulator();
        String word2 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld

    }

}
