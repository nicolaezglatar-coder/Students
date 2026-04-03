package ro.ulbs.proiectaresoftware.students;
import java.util.*;

public class Lab2 {
    public static void main(String[] args) {

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 5; i++) x.add(r.nextInt(11));
        for (int i = 0; i < 7; i++) y.add(r.nextInt(11));

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // a) x + y
        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        // b) intersectie
        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);

        // c) x - y
        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);

        // d) <= p
        int p = 4;
        List<Integer> limited = new ArrayList<>();
        for (int val : xPlusY) {
            if (val <= p) limited.add(val);
        }

        System.out.println("x+y = " + xPlusY);
        System.out.println("intersectie = " + zSet);
        System.out.println("x-y = " + xMinusY);
        System.out.println("<= p = " + limited);
    }
}