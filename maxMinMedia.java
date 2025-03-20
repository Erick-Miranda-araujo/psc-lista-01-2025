package listaExerciciosTres;

import java.util.Scanner;

public class maxMinMedia {
     public static void main(String[] args) {
        double numeroUm, numeroDois, numeroTres, media;
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite o primeiro número: ");
        numeroUm = scanner.nextDouble();

        System.out.println("digite o segundo número: ");
        numeroDois = scanner.nextDouble();
        
        System.out.println("digite o terceiro número: ");
        numeroTres = scanner.nextDouble();
        scanner.close();
        media = (numeroUm + numeroDois +numeroTres)/3;

        if (numeroUm >= numeroDois && numeroUm >= numeroTres) {
          System.out.println("o maior número é: " + numeroUm);  
        }
        else if (numeroDois >= numeroUm && numeroDois >= numeroTres) {
            System.out.println("o maior número é: " + numeroDois);
}
else{
    System.out.println("o maior número é: " + numeroTres);
}
if (numeroUm <= numeroDois && numeroUm <= numeroTres) {
    System.out.println("o menor número é: " + numeroUm);  
  }
  else if (numeroDois <= numeroUm && numeroDois <= numeroTres) {
      System.out.println("o menor número é: " + numeroDois);
}
else{
System.out.println("o menor número é: " + numeroTres);
}
System.out.println("A média dos números é: " + media);
}
}