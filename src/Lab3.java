package ro.ulbs.proiectaresoftware.students;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Lab3 {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("in.txt"));

        // a)
        List<String> a = new ArrayList<>();
        for (String line : lines) {
            a.add(line + "\n");
        }

        // b)
        List<String> b = new ArrayList<>();
        for (String line : lines) {
            b.add(line.replace(".", ".\n"));
        }

        // c)
        List<String> out = new ArrayList<>();
        out.addAll(a);
        out.addAll(b);

        Files.write(Paths.get("out.txt"), out);

        System.out.println("Done!");
    }
}