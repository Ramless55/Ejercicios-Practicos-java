public class Exercise6 {
    public static void main(String[] args) {
        //punto 6
        Operations.sum(2,4);
        //punto 7
        Operations.promedie(3,5);
    }

    class Operations {
        public static void sum( int a , int b ){
            System.out.println("La suma es: " + (a + b));
        }

        public static void promedie( float a , float b ){
            float prom = (a + b) / 2;

            System.out.println("El promedio es: " + prom);
        }
    }
}
