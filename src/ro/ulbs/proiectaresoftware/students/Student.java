package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class Student {
    private int nrMatricol;
    private String prenume;
    private String nume;
    private String grupa;
    private float nota;

    public Student(int nrMatricol, String prenume, String nume, String grupa) {
        this.nrMatricol = nrMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.grupa = grupa;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nrMatricol + " " + prenume + " " + nume + " " + grupa + " nota=" + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return nrMatricol == s.nrMatricol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrMatricol);
    }
}