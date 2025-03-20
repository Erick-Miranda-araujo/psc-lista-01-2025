package listaExerciciosDois;

import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, soma, subtracao, multiplicacao;
    System.out.println("Digite o primeiro número: ");
    num1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    num2 = scanner.nextInt();
scanner.close();
    soma = num1 + num2;
    subtracao = num1 - num2;
    multiplicacao = num1 * num2; 

    System.out.println("soma: " + soma + "\nsubtração: " + subtracao + "\nmultiplicação: " + multiplicacao);
    }
}
