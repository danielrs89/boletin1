import java.util.ArrayList;
import java.util.Arrays;

public class CondicionalesBucles {
    // pedir numero hasta decir 0
    public static ArrayList<Integer> cadenaNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        System.out.println("Introduce un número. Cero para salir.");
        numero = Main.entradaEscaner.nextInt();


        while (numero != 0) {
            numeros.add(numero);
            System.out.println("Introduce un número. Cero para salir.");
            numero = Main.entradaEscaner.nextInt();
        }

        return numeros;

    }

    // juego de adivinar el numero
    public static void adivina() {
         int aleatorio, usuario, puntuacion;
        String respuestaReinicio;
        boolean reiniciarJuego;

        ArrayList<Integer> utilizados = new ArrayList<>();
        aleatorio = (int) ((Math.random() * 100) + 1);
        puntuacion = 10;
        reiniciarJuego =false;

        //        comienza el juego pidiendo un número
        System.out.println("Hola mi nombre es Junlia, ¿Quieres adivinar el número que estoy pensando?.\nTienes 10 intentos.\nIntroduce un número entre el 1 y 100: ");
        usuario = Main.entradaEscaner.nextInt();
        while (usuario != aleatorio) {
            // si esta aqui NO lo adivinado y dice si es mayor o menor
            System.out.println("CASIIIIII!!!!");
            if (usuario < aleatorio) System.out.println("Tu número es más bajo.");
            else System.out.println("Tu número es más alto.");
            System.out.println("--------------------");

            // resta intentos y almacena en numeros utilizados
            puntuacion--;
            utilizados.add(usuario);

            // imprime informacion
            System.out.println("NUMEROS UTILIZADOS: ");
            for (int n : utilizados){
                System.out.println("* "+n);
            }
            System.out.println("--------------------");
            System.out.println("Te quedan "+puntuacion+" intentos");
            System.out.println("--------------------");

            // volver a intentar
            System.out.println("Introduce un número entre el 1 y 100: ");
            usuario = Main.entradaEscaner.nextInt();
        }


        System.out.println("Enorabuena has ganado!!!\n¿Quieres jugar otra vez? (SI/NO)");
        respuestaReinicio = Main.entradaEscaner.next();
        if (respuestaReinicio.toLowerCase() == "si") adivina();
        else {
            System.out.println("Hasta pronto.");
            System.exit(0);
        }

    }
    public static void logicaJuego(){

    }
}
