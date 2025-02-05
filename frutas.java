import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[5];

        int iniciaComAB = 0;
        int terminaComAU = 0;
        int caracteresImpar = 0;

        // Lendo as 5 frutas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine().toUpperCase(); // Convertendo para maiúsculas
        }

        // Processando as frutas
        for (String fruta : frutas) {
            // Verifica se começa com A ou B
            if (fruta.startsWith("A") || fruta.startsWith("B")) {
                iniciaComAB++;
            }
            // Verifica se termina com A ou U
            if (fruta.endsWith("A") || fruta.endsWith("U")) {
                terminaComAU++;
            }
            // Verifica se o número de caracteres é ímpar
            if (fruta.length() % 2 != 0) {
                caracteresImpar++;
            }
        }

        // Exibindo os resultados
        System.out.println("Iniciam com A/B: " + iniciaComAB);
        System.out.println("Terminam com A/U: " + terminaComAU);
        System.out.println("Número de caracteres ímpar: " + caracteresImpar);

        scanner.close();
    }
}
