import java.util.Scanner;
//import java.io.*;

class customTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
