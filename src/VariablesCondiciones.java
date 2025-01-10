import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VariablesCondiciones {
    public static Scanner entradaEscaner = new Scanner(System.in);

    //1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
    public static void coeficientes(double a, double b, double c) {

//        double a, b, c;
        double x1, x2, d;

        System.out.println("Introduce el coeficiente a:");
        a = Main.entradaEscaner.nextDouble();
        System.out.println("Introduce el coeficiente b:");
        b = Main.entradaEscaner.nextDouble();
        System.out.println("Introduce el coeficiente c:");
        c = Main.entradaEscaner.nextDouble();

        //calcula determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0) System.out.println("No existen soluciones reales");
        else {
            // si a es un division por cero
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("solución: " + x1);
            System.out.println("solución: " + x2);
        }
    }

    // 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
    public static void areaCirculo(double r) {
        double a;

        System.out.println("introduce el radio");
        r = Main.entradaEscaner.nextDouble();

        a = Math.PI * (r * r);

        System.out.println("El área del circulo con radio " + r + " es: " + a);
    }

    //    3. Pedir el radio de una circunferencia y calcular su longitud.
    public static double longitudCirculo(double r) {
        double l;
        System.out.print("Introduce el radio círculo: ");
        r = entradaEscaner.nextDouble();
        l = 2 * Math.PI * r;

        return l;

    }

    //    4. Pedir dos números y decir si son iguales o no.
    public static String numerosIguales(double a, double b) {
        System.out.print("Introduce número uno: ");
        a = entradaEscaner.nextDouble();
        System.out.print("Introduce número dos: ");
        b = entradaEscaner.nextDouble();

        if (a == b) return "Los números son iguales.";
        else if (a > b) return "El " + a + " es más grande que " + b;
        else return "El " + b + " es más grande que " + a;

    }

    //    5. Pedir un número e indicar si es positivo o negativo.
    public static String numerosPositivos(double a) {
        System.out.print("Introduce número: ");
        a = entradaEscaner.nextDouble();

        if (a >= 0) return "Es positivo";
        else return "Es negativo";
    }

    // 6. Número múltiplos
    public static String numerosMultiplos(int n1, int n2) {

        System.out.print("Introfuce un número: ");
        n1 = entradaEscaner.nextInt();
        System.out.print("Introfuce un número: ");
        n2 = entradaEscaner.nextInt();

        return n1 % n2 == 0 ? "Son múltiplos" : "No son múltiplos";
    }

    //22. Pedir un número de 0 a 99 y mostrarlo escrito.
    public static String cifrasLetras(int n1) {
        int unidad, decena;
        boolean completo;
        // false hasta que no se imprima el número
        completo = false;

        try {

            // comprobar que el numero de entrada esta dentro del rango
            System.out.println("Meter un número entre el 0 y 99");
            n1 = entradaEscaner.nextInt();

            // excepciondes
            if (n1 == 11 || n1 == 12) {

                completo = true;
                if (n1 == 11) System.out.println("Once");
                if (n1 == 12) System.out.println("Once");
            }

            while (n1 > 99 || n1 < 0 && !completo) {
                System.out.println("El número no es correcto!!!");
                System.out.println("Meter un número entre el 0 y 99");
                n1 = entradaEscaner.nextInt();
            }

            if (!completo){
                // obtener unidades
                unidad = n1 % 10;
                decena = n1 / 10;

                switch (decena){
                    case 0:
                        break;
                    case 1:
                        System.out.print("Diez ");
                        break;
                    case 2:
                        System.out.print("Veinti ");
                        break;
                    case 3:
                        System.out.print("Treinta ");
                        break;
                    case 4:
                        System.out.print("Cuarenta ");
                        break;
                    case 5:
                        System.out.print("Cincuenta ");
                        break;
                    case 6:
                        System.out.print("Sesenta ");
                        break;
                    case 7:
                        System.out.print("Setenta ");
                        break;
                    case 8:
                        System.out.print("Ochenta ");
                        break;
                    case 9:
                        System.out.print("Noventa ");
                        break;
                }
                switch (unidad){
                    case 0:
                        System.out.print("Cero");
                        break;
                    case 1:
                        System.out.print("Uno");
                        break;
                    case 2:
                        System.out.print("Dos");
                        break;
                    case 3:
                        System.out.print("Tres");
                        break;
                    case 4:
                        System.out.print("Cuatro");
                        break;
                    case 5:
                        System.out.print("Cinco");
                        break;
                    case 6:
                        System.out.print("Seis");
                        break;
                    case 7:
                        System.out.print("Siete");
                        break;
                    case 8:
                        System.out.print("Ocho");
                        break;
                    case 9:
                        System.out.print("Nueve");
                        break;
                }


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return "";
    }

}