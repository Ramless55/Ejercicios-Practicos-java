public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Suma: " + Operations.sumatoria(5));

        System.out.println("Suma pares: " + Operations.sumatoriaPares(5));

        System.out.println("Potencia: " + Operations.potencia(2, 4));

        System.out.println("Factorial: " + Operations.factorial(5));

        System.out.println("Cantidad de cifras: " + Operations.cantCifras(-2200));
    }
}

class Operations {
    //ejercicio 10
    static int sumatoria(int n){
        int acc = 0;

        for(int i =  1; i <= n; i++){
            acc = acc + i;
        }

        return acc;
    }

    //ejercicio 11
    static int sumatoriaPares(int n){
        int acc = 0;

        for(int i = 2; i <= n; i = i + 2){
            acc = acc + i;
        }

        return acc;
    }

    //ejercicio 12
    static double potencia(double x, int a){
        double acc = 1;

        for(int i = 1; i <= a; i++){
            acc = acc * x;
        }

        return acc;
    }

    //ejercicio 13
    static double factorial(int n){
        int acc = 1;

        for(int i = 1; i <= n; i++){
            acc = acc * i;
        }

        return acc;
    }

    //ejercicio 14
    static int cantCifras(int n){
        int division = Math.abs(n);
        int cont = 1;

         while(division > 9){
             division = division / 10;
             cont++;
             System.out.println(division);
         }

         return cont;
    }
}