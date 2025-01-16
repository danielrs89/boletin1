import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

//  Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
//    Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado).

public class Tablas {
    private static final int TRIMESTRE = 3;
    private static final int ALUMNOS = 5;
    private static final SecureRandom SECURE = new SecureRandom();
    private static final ArrayList<Integer> notasGrupo1 = new ArrayList<>();
    private static final Alumno alumno = new Alumno();
    private static int cont;
    private static double auxNotaMedia;
    private static final Scanner entradaEscaner = new Scanner(System.in);


    public static void gestionarNotas() {
//        genera las notas de los 5 alumnos del grupo para los tres trimestres
        guardarNotas();
        imprimirTodasNotas();

//        nota media del grupo en cada trimestre
        notaMediaGrupoTrimestre();
//        media del alumno que se encuentra en la posición N
        System.out.println("¿De que alumno quieres saber los 3 trimestres?");
        notasNAlumno(entradaEscaner.nextInt());
    }


    public static int generaNota() {
        return SECURE.nextInt(10);
    }

    public static void guardarNotas() {
        for (int i = 0; i < 15; i++) {
            notasGrupo1.add(alumno.setNota(generaNota()));
        }
    }

    public static void imprimirTodasNotas() {
        cont = 0;
        for (int i = 1; i <= TRIMESTRE; i++) {
            System.out.println("\n" + i + "º Trimestre");
            for (int j = 1; j <= ALUMNOS; j++) {
                System.out.println("Alumno " + j + " nota: " + notasGrupo1.get(cont));
                cont++;
            }
        }

    }

    public static void notaMediaGrupoTrimestre() {
        cont = 0;
        for (int i = 1; i <= TRIMESTRE; i++) {
            System.out.println("\n" + i + "º Trimestre");
            for (int j = 1; j <= ALUMNOS; j++) {
                auxNotaMedia += notasGrupo1.get(cont);
                cont++;
            }
            auxNotaMedia = (auxNotaMedia / ALUMNOS);
            System.out.println("Nota media del grupo: " + Math.round(auxNotaMedia * 100.0) / 100.0);
        }
    }

    public static void notasNAlumno(int numAlumno) {

        double alumno1 = 0, alumno2 = 0, alumno3 = 0, alumno4 = 0, alumno5 = 0;

//  NO es la mejor manera
        switch (numAlumno) {
            case 1: {
                alumno1 = notasGrupo1.get(0);
                alumno1 += notasGrupo1.get(5);
                alumno1 += notasGrupo1.get(10);
                break;
            }
            case 2: {
                alumno2 += notasGrupo1.get(1);
                alumno2 += notasGrupo1.get(6);
                alumno2 += notasGrupo1.get(11);
                break;
            }
            case 3: {
                alumno3 += notasGrupo1.get(2);
                alumno3 += notasGrupo1.get(7);
                alumno3 += notasGrupo1.get(12);
                break;
            }
            case 4: {
                alumno4 += notasGrupo1.get(3);
                alumno4 += notasGrupo1.get(8);
                alumno4 += notasGrupo1.get(13);
                break;
            }
            case 5: {
                alumno5 += notasGrupo1.get(4);
                alumno5 += notasGrupo1.get(9);
                alumno5 += notasGrupo1.get(14);
                break;
            }
        }

        switch (numAlumno) {
            case 1: {
                alumno1 = alumno1 / 3;
                System.out.println("Nota media del alumno 1 en los 3 trimestres: " + Math.round(alumno1 * 100.0) / 100.0);
                break;
            }
            case 2: {
                alumno2 = alumno2 / 3;
                System.out.println("Nota media del alumno 2 en los 3 trimestres: " + Math.round(alumno2 * 100.0) / 100.0);
                break;
            }
            case 3: {
                alumno3 /= 3;
                System.out.println("Nota media del alumno 3 en los 3 trimestres: " + Math.round(alumno3 * 100.0) / 100.0);
                break;
            }
            case 4: {
                alumno4 /= 3;
                System.out.println("Nota media del alumno 4 en los 3 trimestres: " + Math.round(alumno4 * 100.0) / 100.0);
                break;
            }
            case 5: {
                alumno5 /= 3;
                System.out.println("Nota media del alumno 5 en los 3 trimestres: " + Math.round(alumno5 * 100.0) / 100.0);
                break;
            }
        }
    }
}

