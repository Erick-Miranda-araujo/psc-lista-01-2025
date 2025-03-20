package listaExerciciosTres;

import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorCompra, valorPago, troco, quantidade;
        int[] notas = {50, 20, 10, 5, 2, 1} ;

        System.out.println("Informe o valor da compra: ");
        valorCompra = scanner.nextInt();

        System.out.println("Informe o valor pago: ");
        valorPago = scanner.nextInt(); 

        if (valorPago < valorCompra) {
        System.out.println("Quantia insuficiente para realizar a compra");   
        }
        
       troco = valorPago - valorCompra;
      
      System.out.println("troco: " + troco +"R$");
       for (int nota : notas){
        quantidade = troco / nota;
        if (quantidade > 0) {
         System.out.println("Será usadas notas de " + nota + ":" + quantidade);   
        troco %= nota;
        }
    }
       scanner.close();
    }
}
