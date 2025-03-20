package listaExerciciosTres;

import java.util.Scanner;

public class calculoSimbolo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 Double numero1, numero2, soma, subtracao, divisao, multiplicacao, potenciacao;
    String operador;

    System.out.println("digite o primeiro número: ");
    numero1 = scanner.nextDouble();

    System.out.println("digite o segundo número: ");
    numero2 = scanner.nextDouble();

    System.out.println("Digite um dos simbolos para a operação desejada: * + - / ^");
    operador = scanner.next();

   switch (operador) {
    case "*":
    multiplicacao = numero1 * numero2;
    System.out.println("o valor da multiplicação é: " + multiplicacao);    
        break;
   case"/":
   divisao = numero1 / numero2;
   System.out.println("o valor da divisão é: " + divisao);
   break;
   case"-":
   subtracao = numero1 - numero2;
   System.out.println("o valor da subtração é: " + subtracao);
   break;
   case"+":
   soma = numero1 + numero2;
   System.out.println("o valor da soma é: " + soma);
   break;
   case"^":
   potenciacao = Math.pow(numero1, numero2); 
   System.out.println("o valor da potenciação é: " + potenciacao);
   break;
    default:
    System.out.println("operador inválido!");
        break;
   }
scanner.close();
    }
}