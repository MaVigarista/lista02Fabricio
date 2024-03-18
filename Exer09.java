//Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo.

package lista02;
import java.util.Scanner;

public class Exer09 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double pesoIdealHomem, pesoIdealMulher, altura, pesoAtual, sexo, pesoIdealAjustado;

        System.out.print("Escolha seu sexo biológico: ");
        System.out.println("\nMasculino (1) \nFeminino (2)");
        sexo = input.nextDouble();

        System.out.print("Informe sua altura em centímetros: ");
        altura = input.nextDouble();

        System.out.print("Informe seu peso em quilogramas: ");
        pesoAtual = input.nextDouble();

        if (sexo == 1) {

            pesoIdealHomem = 52 + (0.75 * (altura - 152.4));

            pesoIdealAjustado = ((pesoAtual - pesoIdealHomem) * 0.25) + pesoIdealHomem;
            
            System.out.print("Seu peso ideal é: " + pesoIdealAjustado);
        } else if (sexo == 2) {

            pesoIdealMulher = 52 + (0.67 * (altura - 152.4));

            pesoIdealAjustado = ((pesoAtual - pesoIdealMulher) * 0.25) + pesoIdealMulher;

            System.out.print("Seu peso ideal é: " + pesoIdealAjustado);
        }

        input.close();
    }
}
