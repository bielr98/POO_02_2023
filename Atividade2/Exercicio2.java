package Atividade2;
import java.util.Scanner;

// Exercício 2: Conversor de Temperatura Crie um conversor de temperatura que permita ao 
// usuário converter entre Celsius e Fahrenheit. Peça ao usuário para escolher a direção 
// da conversão e, em seguida, faça a conversão e exiba o resultado.

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f\n", fahrenheit);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.printf("Temperatura em Celsius: %.2f\n", celsius);
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}

