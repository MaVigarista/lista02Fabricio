//Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.

package lista02;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double area, largura, comprimento;

        System.out.print("Insira a largura da área (Em metros): ");
        largura = input.nextDouble();

        System.out.print("Insira o comprimento da área (Em metros): ");
        comprimento = input.nextDouble();

        Math.round(area = largura * comprimento + ((largura * comprimento) * 0.1));

        System.out.print("A quantidade de cerâmica em metros será: "  + Math.round(area));

        input.close();
    }
}
