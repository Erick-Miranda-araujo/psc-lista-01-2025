package listaExerciciosTres;

import java.util.Scanner;

public class segundoGrau {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int a, b, c;
     double delta, raiz1, raiz2, raizReal;
     
     System.out.println("Escreva o valor da [a]");
        a = scanner.nextInt();  
        
        System.out.println("Escreva o valor da [b]");
        b = scanner.nextInt();

        System.out.println("Escreva o valor da [c]");
        c = scanner.nextInt();
    
        delta = Math.pow(b, 2) - 4 * a * c;
    raiz1 = -b + Math.sqrt(delta) / 2 * a;
    raiz2 = -b - Math.sqrt(delta) / 2 * a;
    raizReal = -c /b;

    if (a ==0 && b ==0 && c != 0) {
    System.out.println("Coeficientes informados incorretamente");    
    }
    else if (a == 0 && b!= 0) {
    System.out.println("Essa é uma equação de primeiro grau" + "sua raiz é: " + raizReal);    
    }
    else if (delta < 0) {
    System.out.println("Está equação não possui raízes reais");
    }
    else if (delta == 0) {
    System.out.println("Está equação possui duas raízes iguais. As raizes são: " + raiz1 + "," + raiz2 );    
    }
    else if (delta > 0) {
    System.out.println(" Está equação possui duas raízes reais diferentes. As raízes são: " + raiz1 + "," + raiz2);    
    }
    scanner.close();
    }
}
