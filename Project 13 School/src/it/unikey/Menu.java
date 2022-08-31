package it.unikey;

import java.util.Scanner;

public class Menu {
    int cmd = 0;
    String help = "Comandi:\n1: inserisci studente\n2: inserisci tutor\n3: visualizza lista studenti\n4: visualizza lista tutor" +
            "\n5: assegna tutor a studente\n6: vedi assegnazioni\n7: aiuto\n8: chiudi";
    Method method = new Method();


    public Menu() {
    }

    public void menu(){
        Scanner scanner_int = new Scanner(System.in);
        Scanner scanner_stg = new Scanner(System.in);
        System.out.println("Questo è il menù");
        while (cmd != 8){
            System.out.println(help);
            cmd = scanner_int.nextInt();
            switch (cmd){
                case 1:
                    System.out.println("Inserisci il nome  dello studente");
                    String input_nam = scanner_stg.nextLine();
                    System.out.println("Inserisci il cognome dello studente");
                    String input_sur = scanner_stg.nextLine();
                    System.out.println("Inserisci il codice");
                    String input_cod = scanner_stg.nextLine();
                    method.insertStudent(input_nam,input_sur,input_cod);
                    break;
                case 2:
                    System.out.println("Inserisci il nome  dello tutor");
                    String input_nam_n = scanner_stg.nextLine();
                    System.out.println("Inserisci il cognome dello tutor");
                    String input_sur_t = scanner_stg.nextLine();
                    System.out.println("Inserisci anno di nascita");
                    int input_year = scanner_int.nextInt();
                    method.insertTutor(input_nam_n,input_sur_t,input_year);
                    break;
                case 3:
                    System.out.println(method.visualizeStudents());
                    break;
                case 4:
                    System.out.println(method.visualizeTutor());

                    break;
                case 5:
                    System.out.println("Inserisci il cognome dello studente");
                    String input_1 = scanner_stg.nextLine();
                    Tutor tutor = new Tutor(null,null,0);
                    Student student = new Student(null,null,null);
                    for(Student s: method.getStudents()){
                        if (s.getSurname() == input_1);
                        student = s;
                    }
                    System.out.println("Inserisci il cognome  del tutor");
                    String input_2 = scanner_stg.nextLine();
                    for(Tutor t: method.getTutors()){
                        if (t.getSurname() == input_2);
                        tutor = t;
                    }
                    method.assignStudent(tutor, student);
                    break;
                case 6:
                    System.out.println(method.printAss());
                    break;
                case 7:
                    System.out.println(help);
                    break;
                case 8:
                    System.out.println("Hai terminato la sessione");
                    break;

            }
        }
    }
}
