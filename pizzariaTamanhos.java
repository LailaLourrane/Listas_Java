import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double PrecoPizzaP = 20.00;
        final double PrecoPizzaM = 30.00;
        final double PrecoPizzaG = 40.00;

        double total = 0;

        System.out.print("Quantas pizzas você deseja:");
        int qtdPizzas = scanner.nextInt();

        for (int i = 1; i < qtdPizzas; i++) {
            System.out.print("Digite o tamanho do pizza " + i + "(P/M/G): ");
            char tamanho = scanner.next().toUpperCase().charAt(0);

            switch (tamanho) {
                case 'P':
                    total += PrecoPizzaP;
                    break;
                case 'M':
                    total += PrecoPizzaM;
                    break;
                case 'G':
                    total += PrecoPizzaG;
                    break;
                default:
                    System.out.println("Erro!");
                    i--;
            }
        }

        System.out.printf("Total de pizzas: %.2f\n", total);

        scanner.close();
    }
}
