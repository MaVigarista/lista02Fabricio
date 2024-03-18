//Crie um programa para calcular a regra de três.

package lista02;
import java.util.*;


public class Exer04 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero;

        System.out.println("Se: ");
        primeiroNumero = input.nextDouble();

        System.out.println("É igual a: ");
        segundoNumero = input.nextDouble();

        System.out.println("Então: ");
        terceiroNumero = input.nextDouble();

        quartoNumero = (terceiroNumero * segundoNumero) / primeiroNumero;

        System.out.println("O resultado para essa regra de três é: " + quartoNumero);

        input.close();
    }
}
