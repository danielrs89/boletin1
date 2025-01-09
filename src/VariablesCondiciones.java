import java.util.Scanner;

public class VariablesCondiciones {

    public static void coeficientes(){
        Scanner entradaEscaner = new Scanner(System.in);
        double a,b,c;
        double x1,x2,d;

        System.out.println("Introduce el coeficiente a:");
        a=entradaEscaner.nextDouble();
        System.out.println("Introduce el coeficiente b:");
        b=entradaEscaner.nextDouble();
        System.out.println("Introduce el coeficiente c:");
        c=entradaEscaner.nextDouble();

        //calcula determinante
        d = ((b*b)-4*a*c);
        if (d<0) System.out.println("No existen soluciones reales");
        else {
            // si a es un division por cero
            x1 = (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("solución: "+x1);
            System.out.println("solución: "+x2);
        }
    }



}
