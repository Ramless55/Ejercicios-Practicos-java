import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float number1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        float number2 = scan.nextInt();

        float promedio = (number1 + number2) / 2;

        System.out.println("El promedio es: " + promedio);
    }
}
