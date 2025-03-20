package listaExerciciosTres;

import java.util.Random;
import java.util.Scanner;

public class sorteioImparPar {
    public static void main(String[] args) {
        int numeroUm, numeroDois, sorteio, maior, menor;
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite o primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.println("digite o segundo número: ");
        numeroDois = scanner.nextInt();
        
        if (numeroUm >= numeroDois) {
            maior = numeroUm;
        }
        else{
            maior = numeroDois;
        }
        
        if (numeroUm <= numeroDois) {
            menor = numeroUm;
        }
        else{
            menor = numeroDois;
        }
        Random random = new Random();
    sorteio = random.nextInt(maior - menor ++)+ menor;
    
    if (sorteio %2 == 0) {
     System.out.println( "O número sorteado é par" + sorteio ); 
    }
    else{
        System.out.println( "O número sorteado é impar" + sorteio ); 
    }
    scanner.close();
    }
}
