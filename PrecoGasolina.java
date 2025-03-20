package listaExerciciosDois;

import java.util.Scanner;

public class PrecoGasolina {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
double precoGasolina, Litro, pagar;

System.out.println("Informe o preço do litro da gasolina: ");
precoGasolina = scanner.nextDouble();

System.out.println("Informe Quantos litros deseja colocar: ");
Litro = scanner.nextDouble();
scanner.close();
pagar = precoGasolina * Litro;

System.out.println("você irá pagar pela gasolina " + pagar + "R$");
 }   
}
