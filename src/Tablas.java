import java.security.SecureRandom;
import java.util.ArrayList;

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

    public static void gestionarNotas() {
        //genera las notas de los 5 alumnos del grupo para los tres trimestres
        guardarNotas();
        imprimirTodasNotas();

//        nota media del grupo en cada trimestre
        notaMediaGrupoTrimestre();
//        media del alumno que se encuentra en la posición N
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
            System.out.println("Nota media del grupo: " + Math.round(auxNotaMedia*100.0)/100.0);

        }

    }


    public static void imprimirAlumnoNotas() {
        int cont = 0;
        for (int i = 1; i <= TRIMESTRE; i++) {
            System.out.println("\n" + i + "º Trimestre");
            for (int j = 1; j <= ALUMNOS; j++) {
                System.out.println("Alumno " + j + " nota: " + notasGrupo1.get(cont));
                cont++;
            }
        }
    }
}

