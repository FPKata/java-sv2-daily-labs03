package day01;

public class School {
    public static void main(String[] args) {
        Students student = new Students();
        student.addHeight(123);
        student.addHeight(122);
        student.addHeight(129);
        student.addHeight(130);
        student.addHeight(155);

        System.out.println(student.isHeightsIncreasing());
    }
}
