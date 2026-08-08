import java.util.Scanner;

public class  Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Application started");
        System.out.println("............");
        System.out.println("Please enter your name : ");
        String userInput = scanner.nextLine();
        System.out.println("Hallo" +" " + userInput);
        scanner.close();

    }
}
