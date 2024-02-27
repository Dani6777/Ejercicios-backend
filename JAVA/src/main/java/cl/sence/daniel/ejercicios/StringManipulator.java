package cl.sence.daniel.ejercicios;

public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        return a.trim() + b.trim();
    }

    public Integer getIndexOrNull(String a, char b) {
        if (a.indexOf(b) == -1) {
            return null;
        } else {
            return a.indexOf(b);
        }
    }

    public Integer getIndexOrNull(String a, String b) {
        if (a.indexOf(b) == -1) {
            return null;
        } else {
            return a.indexOf(b);
        }
    }

    public String concatSubstring(String a, int b, int c, String d) {
        return a.substring(b, c) + d;
    }

}
