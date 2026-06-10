import java.util.Scanner;

/**
 * Simulador de Votación Simple - Programa CLI para procesar votos.
 */
public class SimuladorVotacion {

    // Variables para almacenar los votos de cada candidato
    private static int votosCandidatoA = 0;
    private static int votosCandidatoB = 0;

    // ==========================================
    // TODO: DEV 1 - Registrar votos del Candidato A
    // Requisitos: Crear una función que sume o registre votos para el Candidato A.
    // ==========================================
    

    // ==========================================
    // TODO: DEV 2 - Registrar votos del Candidato B
    // Requisitos: Crear una función que sume o registre votos para el Candidato B.
    // ==========================================
    

    // ==========================================
    // TODO: DEV 3 - Calcular porcentajes
    // Requisitos: Crear una función que calcule y muestre el porcentaje de votos 
    // obtenido por cada candidato sobre el total de votos emitidos.
    // ==========================================
    

    // ==========================================
    // TODO: DEV 4 - Determinar ganador - IMPLEMENTADO
    // Requisitos: Crear una función que compare los votos de ambos candidatos
    // y determine quién es el ganador o si se presenta un empate.
    // ==========================================
    public static void determinarGanador() {
        if (votosCandidatoA > votosCandidatoB) {
            System.out.println("¡El ganador es el Candidato A con " + votosCandidatoA + " votos!");
        } else if (votosCandidatoB > votosCandidatoA) {
            System.out.println("¡El ganador es el Candidato B con " + votosCandidatoB + " votos!");
        } else {
            System.out.println("Empate: Ambos candidatos tienen " + votosCandidatoA + " votos.");
        }
    }


    /**
     * Función Principal (Main)
     * Procesa la interfaz de línea de comandos (CLI) para interactuar con el simulador.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("================================================");
        System.out.println("   BIENVENIDO AL SIMULADOR DE VOTACIÓN SIMPLE   ");
        System.out.println("================================================");

        while (!salir) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Registrar votos para Candidato A");
            System.out.println("2. Registrar votos para Candidato B");
            System.out.println("3. Ver porcentajes de votación");
            System.out.println("4. Determinar ganador");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada incorrecta
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad de votos para Candidato A: ");
                    int votosA = scanner.nextInt();
                    // LLAMAR AQUÍ A LA FUNCIÓN REGISTRAR VOTOS CANDIDATO A
                    
                    break;
                case 2:
                    System.out.print("Ingrese cantidad de votos para Candidato B: ");
                    int votosB = scanner.nextInt();
                    // LLAMAR AQUÍ A LA FUNCIÓN REGISTRAR VOTOS CANDIDATO B

                    break;
                case 3:
                    // LLAMAR AQUÍ A LA FUNCIÓN CALCULAR PORCENTAJES

                    break;
                case 4:
                    // LLAMAR AQUÍ A LA FUNCIÓN DETERMINAR GANADOR
                    determinarGanador();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del simulador de votación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
