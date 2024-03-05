import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int number1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int number2 = scan.nextInt();

        System.out.println("La suma es: " + (number1 + number2));
    }
}
