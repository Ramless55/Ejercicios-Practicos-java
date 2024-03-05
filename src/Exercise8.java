import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        float number1 = scan.nextFloat();

        System.out.println("Ingrese otro numero: ");
        float number2 = scan.nextFloat();

        Notes.ponerNota(number1, number2);
    }
}

class Notes {
    static void ponerNota(double x, double y){
        double prom = (x + y) / 2;

        if(prom >= 7){
            System.out.println("Promocionado con: " + prom);
        }else if(prom >= 4){
            System.out.println("Aprobado con: " + prom);
        }else {
            System.out.println("Debe recuperar, se saco un: " + prom);
        }
    }
}