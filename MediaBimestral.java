package listaExerciciosDois;

import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, mediaBimestral;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextInt();

        System.out.println("Digite a quarta nota: ");
        nota4 = scanner.nextInt();
         scanner.close();
        mediaBimestral = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média das notas foi: " + mediaBimestral);
    }
}
