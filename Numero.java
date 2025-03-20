package listaExerciciosDois;

import java.util.Scanner;
public class Numero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int numero;
    
    System.out.println("Digite um número: ");
    numero = scanner.nextInt();
    scanner.close();
    System.out.println("O numero digitado foi: " + numero);
    }
}