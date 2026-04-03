package ro.ulbs.proiectaresoftware.students;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class AppLab4 {

    public static void main(String[] args) throws IOException {

        // 🔹 1. Citire studenti
        List<String> liniiStudenti = Files.readAllLines(Paths.get("studenti.txt"));

        HashMap<Integer, Student> mapStudenti = new HashMap<>();

        for (String linie : liniiStudenti) {
            String[] parts = linie.split(",");

            int nr = Integer.parseInt(parts[0]);
            String prenume = parts[1];
            String nume = parts[2];
            String grupa = parts[3];

            Student s = new Student(nr, prenume, nume, grupa);
            mapStudenti.put(nr, s); // 🔥 O(1)
        }

        // 🔹 2. Citire note
        List<String> liniiNote = Files.readAllLines(Paths.get("note_anon.txt"));

        for (String linie : liniiNote) {
            String[] parts = linie.split(",");

            int nr = Integer.parseInt(parts[0]);
            float nota = Float.parseFloat(parts[1]);

            Student s = mapStudenti.get(nr); // 🔥 O(1)
            if (s != null) {
                s.setNota(nota);
            }
        }

        // 🔹 3. Afisare
        for (Student s : mapStudenti.values()) {
            System.out.println(s);
        }
    }
}