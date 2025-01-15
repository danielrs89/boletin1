import java.util.Scanner;

public class Main {
    public static Scanner entradaEscaner = new Scanner(System.in);

    //private static double a,b,c,r;
    //private static int n1, n2;
    public static void main(String[] args) {
// PARTE 1 - VariablesCondiciones
//        VariablesCondiciones.coeficientes(a,b,c);//1. Ecuación de segundo grado
//        VariablesCondiciones.areaCirculo(r);// 2. Calcular área círculo.
//        System.out.println("La longitud es: "+VariablesCondiciones.longitudCirculo(r)); // 3. Calcular longitud círculo.
//        System.out.println(VariablesCondiciones.numerosIguales(a,b));// 4. Números iguales o no.
//        System.out.println(VariablesCondiciones.numerosPositivos(a)); // 5. positivo o negativo
//        System.out.println(VariablesCondiciones.numerosMultiplos(n1,n2)); // 6. multiplos o no
//        VariablesCondiciones.cifrasLetras(n1);

        // PARTE 2 - CondicionalesBucles
        // juego Junlia adiva el númeno
        try {
            CondicionalesBucles.adivina();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // PARTE 3 - BuclesAnidados
//        int tabla,i;
//        for (tabla=1; tabla<=10; tabla++)
//        {
//            System.out.println ("\n\nTabla del " +tabla);
//            System.out.println ("---------------");
//            for (i=1;i<=10;i++)
//            {
//                System.out.println (tabla + " x " + i + " = " + tabla*i);
//            }
//        }
    }


        }

