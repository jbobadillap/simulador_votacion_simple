import java.util.Scanner;

/**
 * Simulador de Votación Simple - Programa CLI para procesar votos.
 */
public class SimuladorVotacion {

    // Variables para almacenar los votos de cada candidato
    private static int votosCandidatoA = 0;
    private static int votosCandidatoB = 0;

    // ==========================================
    // DEV 1 - Registrar votos del Candidato A
    // ==========================================

    public static void registrarVotoCandidatoA(int cantidad) {
        votosCandidatoA += cantidad;
        System.out.println("Se registraron: " + votosCandidatoA + " votos para el candidato A");
    }

    // ==========================================
    // DEV 2 - Registrar votos del Candidato B
    // ==========================================

    public static void registrarVotoCandidatoB(int cantidad) {
        votosCandidatoB += cantidad;
        System.out.println("Se registraron: " + votosCandidatoB + " votos para el candidato B");
    }

    // ==========================================
    // DEV 3 - Calcular porcentajes
    // ==========================================

    public static void calcularPorcentajes(){
        int totalVotos = votosCandidatoA + votosCandidatoB;

        if (totalVotos == 0) {
            System.out.println(" No hay votos registrados todavía.");
            return;
        }
        double porcentajeA = (votosCandidatoA * 100.0) / totalVotos;
        double porcentajeB = (votosCandidatoB * 100.0) / totalVotos;

        System.out.println("\n--- Porcentajes de Votación ---");
        System.out.printf("Porcentaje Candidato A: %.2f%%\n", porcentajeA);
        System.out.printf("Porcentaje Candidato B: %.2f%%\n", porcentajeB);
        System.out.println("Total de votos: " + totalVotos);
    }

    // ==========================================
    // DEV 4 - Determinar ganador
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
                    if (scanner.hasNextInt()) {
                        int votosA = scanner.nextInt();
                        if (votosA >= 0) {
                            registrarVotoCandidatoA(votosA);
                        } else {
                            System.out.println("La cantidad de votos no puede ser negativa.");
                        }
                    } else {
                        System.out.println("Por favor, ingrese un número válido.");
                        scanner.next();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese cantidad de votos para Candidato B: ");
                    if (scanner.hasNextInt()) {
                        int votosB = scanner.nextInt();
                        if (votosB >= 0) {
                            registrarVotoCandidatoB(votosB);
                        } else {
                            System.out.println("La cantidad de votos no puede ser negativa.");
                        }
                    } else {
                        System.out.println("Por favor, ingrese un número válido.");
                        scanner.next();
                    }

                    break;
                case 3:
                    calcularPorcentajes();

                    break;
                case 4:
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
