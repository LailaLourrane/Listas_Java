import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 4 dígitos: ");
        int numero = scanner.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("Por favor, digite um número com exatamente 4 dígitos.");
        } else {
            String numeroStr = String.valueOf(numero);
            String numeroInvertido = new StringBuilder(numeroStr).reverse().toString();
            System.out.println("Número invertido: " + numeroInvertido);
        }

        scanner.close();
    }
}
