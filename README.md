# PARTE 1 - VariablesCondiciones
```java
public static String numerosMultiplos(int n1, int n2) {

    System.out.print("Introduce un número: ");
    n1 = entradaEscaner.nextInt();
    System.out.print("Introduce otro número: ");
    n2 = entradaEscaner.nextInt();

    return n1 % n2 == 0 ? "Son múltiplos" : "No son múltiplos";
}
```
# PARTE 2 - CondicionalesBucles
```java
import java.util.ArrayList;

public class CondicionalesBucles {
    private static int puntuacion, aleatorio, usuario;
    private static String respuestaReinicio;
    private static ArrayList<Integer> utilizados = new ArrayList<>();

    // juego de adivinar el numero
    public static void adivina() {
        aleatorio = (int) ((Math.random() * 100) + 1);
        puntuacion = 10;
        utilizados.clear();

        logicaJuego();
    }

    public static void logicaJuego() {
        // comienza el juego pidiendo un número
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
            for (int n : utilizados) {
                System.out.print(" - " + n);
            }

            if (puntuacion != 0) {
                System.out.println("\n--------------------");
                System.out.println("Te quedan " + puntuacion + " intentos");
                System.out.println("--------------------");

                // volver a intentar
                System.out.println("Introduce un número entre el 1 y 100: ");
                usuario = Main.entradaEscaner.nextInt();
            } else {
                System.out.println("\n------------------- Lo siento has perdido!!! --------------------\nHasta pronto.");
                System.exit(0);
            }
        }

        System.out.println("------------------- Enorabuena has ganado!!! -------------------\n¿Quieres jugar otra vez? (SI/NO)");
        respuestaReinicio = Main.entradaEscaner.next();
        if (respuestaReinicio.equalsIgnoreCase("si")) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            adivina();
        } else {
            System.out.println("Hasta pronto.");
            System.exit(0);
        }
    }

}

```
![image](https://github.com/user-attachments/assets/84e16a2d-26ff-4c17-b991-d67870d7888b)




