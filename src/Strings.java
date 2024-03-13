import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a;
        String b;

        System.out.print("Введите текст a: ");
        a = input.nextLine();

        System.out.print("Введите текст b: ");
        b = input.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}