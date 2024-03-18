//Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.

package lista02;
import java.util.Scanner;

public class Exer08 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double tamanhoArquivo, velocidadeDownload, tempoMinutos;

        System.out.print("Informe qual o tamanho do arquivo em MB: ");
        tamanhoArquivo = input.nextDouble();

        System.out.print("Informe a velocidade do download em MB/s: ");
        velocidadeDownload = input.nextDouble();

        tempoMinutos = (tamanhoArquivo / velocidadeDownload) / 60;

        System.out.print("O tempo em minutos é de: " + tempoMinutos);

        input.close();
    }
}
