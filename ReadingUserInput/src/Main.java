import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your years of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.println("Enter your name :" );
        String name = scanner.nextLine();

        int age = 2018 - yearOfBirth;

        System.out.println("Your name is " + name);

        scanner.close();
    }
}
