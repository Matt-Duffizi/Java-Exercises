package it.unikey;

import java.util.Comparator;
import java.util.Objects;

public class Student extends Person implements Comparable<Student> {
    private String studentId;

    public Student(String name, String surname, String id) {
        super(name, surname);
        this.studentId = id;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(),studentId);
    }

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing((Student t) -> t.getSurname()).thenComparing(t -> t.getName()).compare(this,o);
    }
}
