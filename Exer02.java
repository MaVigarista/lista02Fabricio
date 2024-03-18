//Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.

package lista02;
import java.util.*;

public class Exer02 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double gasolina, etanol, calculoGasolina;

        System.out.print("Qual o preço da gasolina? ");
        gasolina = input.nextDouble();

        System.out.print("Qual o preço do etanol? ");
        etanol = input.nextDouble();

        calculoGasolina = gasolina * 0.7;

        if (etanol >= calculoGasolina) {
            System.out.print("Segundo os cálculos, é melhor abastecer com gasolina!");
        } else if (etanol < calculoGasolina) {
            System.out.print("Segundo os cálculos, é melhor abastecer com etanol!");
        }

        input.close();
    }
}
