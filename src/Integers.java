import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Введите число a: ");
        a = input.nextInt();

        System.out.print("Введите число b: ");
        b = input.nextInt();

        int addition = a + b;
        int subtractionFromAtoB = a - b;
        int subtractionFromBtoA = b - a;
        int multiplication = a * b;

        if (a > b)
            System.out.println("a > b");
        if (a < b)
            System.out.println("a < b");
        if (a == b)
            System.out.println("a = b");

        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + subtractionFromAtoB);
        System.out.println("b - a = " + subtractionFromBtoA);
        System.out.println("b * a = " + multiplication);
    }
}