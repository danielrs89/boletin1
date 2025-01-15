import java.security.SecureRandom;
import java.util.Objects;

public class BuclesAnidados {
    //    Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    private static String cont1;
    private static String cont2;
    private static String cont3;
    private static String cont4;
    private static String cont5;
    private static final SecureRandom SECURE = new SecureRandom();
    static int cont = 0;


    public static void contador() {
        try {
            // bucle principal va a funcionar hasta que todas "E"
            do {
                if (!Objects.equals(cont1, "E")) cont1 = cifraLetra(generaAlea(9));
                if (!Objects.equals(cont2, "E")) cont2 = cifraLetra(generaAlea(9));
                if (!Objects.equals(cont3, "E")) cont3 = cifraLetra(generaAlea(9));
                if (!Objects.equals(cont4, "E")) cont4 = cifraLetra(generaAlea(9));
                if (!Objects.equals(cont5, "E")) cont5 = cifraLetra(generaAlea(9));

                System.out.println(cont1 + " - " + cont2 + " - " + cont3 + " - " + cont4 + " - " + cont5);
                cont++;
            } while (!Objects.equals(cont1, "E") ||
                    !Objects.equals(cont2, "E") ||
                    !Objects.equals(cont3, "E") ||
                    !Objects.equals(cont4, "E") ||
                    !Objects.equals(cont5, "E"));

            System.out.println("Se obtuvo en " + cont + " intentos.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String generaAlea(int rango) {
        try {
            return String.valueOf(SECURE.nextInt(rango));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String cifraLetra(String cont) {
        try {
            return Objects.equals(cont, "3") ? cont = "E" : cont;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
