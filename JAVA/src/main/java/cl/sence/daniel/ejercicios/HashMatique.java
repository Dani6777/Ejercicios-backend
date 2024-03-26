package cl.sence.daniel.ejercicios;

import java.util.HashMap;

public class HashMatique {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Molinos de viento", "Si acaso tú no ves más allá de tu nariz");
        trackList.put("Fiesta pagana", "No me digas que no sientes nada al escuchar esta canción");
        trackList.put("El que quiera entender que entienda",
                "El que quiera entender que entienda, el que quiera seguir que siga");
        trackList.put("La costa del silencio", "En la costa del silencio, donde solo habita el miedo");

        String cancion = trackList.get("Fiesta pagana");

        System.out.println("La letra de la canción es: " + cancion);

        for (String key : trackList.keySet()) {
            System.out.println("Track: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}
