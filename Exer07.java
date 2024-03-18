//Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.

package lista02;
import java.util.Scanner;

public class Exer07 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double area, largura, comprimento, preco;
        int piso;

        System.out.print("Insira a largura da área (Em metros): ");
        largura = input.nextDouble();

        System.out.print("Insira o comprimento da área (Em metros): ");
        comprimento = input.nextDouble();

        Math.round(area = largura * comprimento + ((largura * comprimento) * 0.1));

        System.out.print("Escolha por código qual o tipo de piso deseja:");
        System.out.println("\n(1)Acetinado - R$30,00m^2 . \n(2)Brilhante - R$45,00m^2");
        piso = input.nextInt();

        if (piso == 1) {
            preco = area * 30;

            System.out.print("Considerando o valor do acetinado sendo R$30,00. O total fica em: R$" + preco);
        } else if (piso == 2) {
            preco = area * 45;

            System.out.print("Considerando o valor do brilhante sendo R$45,00. O total fica em: R$" + preco);
        }

        input.close();
    }
}
