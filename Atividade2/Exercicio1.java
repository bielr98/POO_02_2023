package Atividade2;
import java.util.Scanner;

//Exercício 1: Calculadora Simples Crie um programa Java que funcione como uma calculadora
//simples. Peça ao usuário para inserir dois números e uma operação (+, -, *, /). 
//Realize a operação escolhida e exiba o resultado.

//CALCULADORA SIMPLES
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double result = 0;
        switch(operacao) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.printf("Resultado: %.2f\n", result);
    }
}

