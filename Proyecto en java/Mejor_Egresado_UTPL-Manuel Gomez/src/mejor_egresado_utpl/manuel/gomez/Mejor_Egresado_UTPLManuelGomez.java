package mejor_egresado_utpl.manuel.gomez;
import java.util.Scanner;
public class Mejor_Egresado_UTPLManuelGomez {
    public static void main(String[] args) {
        String nomEstudiante, estudianteEgresado = "", estudianteEgresado2 = "";
        int numEstudiantes, cont = 1, contCiclos, numCiclos;
        double promedioFinalEstudiante = 0, promedioEgresado = 0, promCiclo, promCiclos;
        boolean egresadosIguales = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("=================================== MEJOR EGRESADO UTPL ===================================");
        System.out.println("-Ingresar la Cantidad de Estudiantes");
        numEstudiantes = teclado.nextInt();
        while (cont <= numEstudiantes) {
            System.out.println("-Ingresar los NOMBRES y APELLIDOS del Estudiante");
            teclado.nextLine();
            nomEstudiante = teclado.nextLine();
            System.out.println("-Ingresar el Numero de Ciclos de la Carrera del Estudiante");
            numCiclos = teclado.nextInt();
            contCiclos = 1;
            promCiclos = 0;
            while (contCiclos <= numCiclos) {
                System.out.println("-Ingresar el Promedio Final del Ciclo "+contCiclos);
                promCiclo = teclado.nextDouble();
                promCiclos = (promCiclos + promCiclo);
                promedioFinalEstudiante = (promCiclos / numCiclos);
                contCiclos++;
            }
            if (promedioFinalEstudiante > promedioEgresado) {
                estudianteEgresado = nomEstudiante;
                promedioEgresado = promedioFinalEstudiante;
                egresadosIguales = false;
            }
            else if (promedioFinalEstudiante == promedioEgresado) {
                estudianteEgresado2 = nomEstudiante;
                egresadosIguales = true;
            }
            cont++;
        }
        System.out.println("=================================== MEJOR EGRESADO UTPL ===================================");
        if (egresadosIguales == true) {
            System.out.println("Los Mejores Egresados UTPL son: ");
            System.out.println("El estudiante "+estudianteEgresado+" por tener un Promedio Final de "+promedioEgresado);
            System.out.println("El estudiante "+estudianteEgresado2+" por tener un Promedio FInal de "+promedioEgresado);
        }
        else {
            System.out.println("El Mejor Egresado UTPL es: ");
            System.out.println("El estudiante "+estudianteEgresado+" por tener un Promedio Final de "+promedioEgresado);
        }
        System.out.println("===========================================================================================");
    }
}
//Desarrollado por Manuel Gomez