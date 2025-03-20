package listaExerciciosTres;

import java.util.Scanner;

public class areaPerimetro {
     public static void main(String[] args) {
        int raio, operador;
        double perimetro, area, esfera, pi = 3.141592;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite:\n 1 para calcular perímetro do circulo\n 2 para a área do circulo\n 3 para o volume da esfera: ");
        operador = scanner.nextInt();

        System.out.println("Digite o valor do raio: ");
        raio = scanner.nextInt();

    switch (operador) {
        case 1:
         perimetro = 2 * pi * raio;
         System.out.println("O perímetro do circulo é:" + perimetro);   
            break;
        case 2: 
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do circulo é: " + area);
        break;
        case 3:
        esfera = 4/3 * pi * Math.pow(raio, 3);
        System.out.println("o volume da esfera é: " + esfera);
        break;
        default:
        System.out.println("ERRO!!!, o código de operação é inválido");
            break;
            }

    scanner.close();
}
}