package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Method {

    private TreeSet<Tutor> tutors = new TreeSet<>();
    private TreeSet<Student> students = new TreeSet<>();
    private TreeMap<Tutor,ArrayList<Student>> assignments= new TreeMap<>();

    public Method() {
    }

    public TreeSet<Tutor> getTutors() {
        return tutors;
    }

    public TreeSet<Student> getStudents() {
        return students;
    }

    public void insertStudent(String nam, String sur, String cod){
        Student st = new Student(nam,sur,cod);
        String newName = st.getName().substring(0,1).toUpperCase()
                + st.getName().substring(1).toLowerCase();
        String newSurname = st.getSurname().substring(0,1).toUpperCase()
                + st.getSurname().substring(1).toLowerCase();

        st.setName(newName);
        st.setSurname(newSurname);
        this.students.add(st);
    }

    public void insertTutor(String nam,String sur, int cod)
    {   Tutor t = new Tutor(nam,sur,cod);
        String newName = t.getName().substring(0,1).toUpperCase()
                + t.getName().substring(1).toLowerCase();
        String newSurname = t.getSurname().substring(0,1).toUpperCase()
                + t.getSurname().substring(1).toLowerCase();

        t.setName(newName);
        t.setSurname(newSurname);

        this.tutors.add(t);
    }

    public String visualizeStudents(){
        String result = "Studenti: ";
        for(Student s: students){
            result = result + "\n " + s.getSurname() + " " + s.getName() + " " + s.getStudentId();
        }
        return result;
    }

    public String visualizeTutor(){
        String result = "Tutors: ";
        for(Tutor t: tutors){
            result = result + "\n " + t.getSurname() + " " + t.getName();
        }
        return result;
    }

    public void assignStudent(Tutor t, Student st){
        if (!(assignments.keySet().contains(t))) {
            ArrayList list = new ArrayList<>();
            list.add(st);
            assignments.put(t,list);
        } else {
            ArrayList<Student> list = assignments.get(t);
            list.add(st);
            assignments.put(t,list);
        }


    }

    public String printAss(){
        String result = "Le Assegnazioni: ";
        for(Tutor m : assignments.keySet()){
            ArrayList<Student> subset = assignments.get(m);
            String list_st = "";
            for(Student s: subset){
                list_st = list_st + " " + s.getSurname() + " " + s.getName() +";";

            }
            result = result + "\n " + m.getSurname() + ": " + list_st;
        }
        return result;
    }


}
