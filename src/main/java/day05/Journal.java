package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Journal {
    private List<String> students = new ArrayList<>();

    boolean addStudent(String studentName){
        studentName = studentName.trim();
        if (studentName.contains(" ")){
            students.add(studentName);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a tanuló nevét!");
        String studentName = scanner.nextLine();
        Journal journal = new Journal();
        boolean isStudentNameRight = journal.addStudent(studentName);
        if (isStudentNameRight){
            System.out.println("A név megfeleő.");
        }
        else{
            System.out.println("A név helytelen.");
        }
        System.out.println("---------------");
        System.out.println(journal.students.size());
    }
}
