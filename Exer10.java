//A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.

package lista02;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double peso, consumoAgua;

        System.out.print("Informe o seu peso em quilogramas: ");
        peso = input.nextDouble();

        consumoAgua = (peso * 35) / 1000;

        System.out.println("A quantidade de água em litros que você deve consumir é de: " + consumoAgua + "L por dia!");
        
        input.close();
    }
}
