public class Exercise9 {
    public static void main(String[] args) {
        Date.imprimirFecha(5, 12, 2001);
    }
}

class Date {
    static void imprimirFecha(int day, int month, int year){

        Months[] months = Months.values();

        System.out.println(day + " de " + months[month-1] + " de " + year);
    }
}

enum Months {
    Enero,
    Febrero,
    Marzo,
    Abril,
    Mayo,
    Junio,
    Julio,
    Agosto,
    Septiembre,
    Octubre,
    Noviembre,
    Diciembre;
}
