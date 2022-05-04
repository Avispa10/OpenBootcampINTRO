public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;

        if ( numeroIf > 0 ) {} else if ( numeroIf < 0) {}
        else {};

        int numeroWhile = -1 ;

        while ( numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        do {numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);} while (numeroWhile < 4 );

        int numeroFor = 0 ;
        for (int i = 0 ; i <= 3 ; i++) {
            System.out.println("numero for " + numeroFor);
            numeroFor++;
        }

        String estacion = "Verano";

         switch (estacion) {
             case "Verano" :
                 System.out.println("Es verano");
                 break;
             case "Invierno" :
                 System.out.println("Es invierno");
                 break;
             case "Primavera":
                 System.out.println("Es primavera");
                 break;
             case "oton;o" :
                 System.out.println("Es oto;o");
             default:
                 System.out.println("No es una estacion");
         }

    }
}