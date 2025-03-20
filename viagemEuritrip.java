package listaExerciciosDois;

import java.util.Scanner;

public class viagemEuritrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double alemanha, portugal, italia, valorTotal;
    int pesssoas;    

    System.out.println("Informe o preço da viagem com destino a Alemanha");
    alemanha = scanner.nextDouble();
    System.out.println("Informe o preço da viagem com destino a Portugal");
    portugal = scanner.nextDouble();
    System.out.println("Informe o preço da viagem com destino a Itália");
    italia = scanner.nextDouble();
    
    System.out.println("Informe quantas pessoas irão nas três viagens: ");
    pesssoas = scanner.nextInt();
scanner.close();
    valorTotal = (alemanha + portugal + italia) * pesssoas;
    System.out.println("O valor total da viagem é de: " + valorTotal); 
    }
}
