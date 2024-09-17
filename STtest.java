
/**
 * STtest
 */

//import java.io.*;

class Student {
    private String name, city;
    private int age;

    public void getData(String x, String y, int t) {
        name = x;
        city = y;
        age = t;
    }

    public void printData() {
        System.out.println("Student name = " + name);
        System.out.println("Student city = " + city);
        System.out.println("Student age = " + age);
    }
}

class STtest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.getData("Kapil", "Delhi", 23);
        s1.printData();

        s2.getData("Amit", "Dehradun", 22);
        s2.printData();
    }
}
 