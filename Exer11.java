//Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.

package lista02;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double horas, potencia, valorKWh, calcGasto, kwGasto;

        System.out.println("Informe quantas horas o seu equipamento fica ligado por dia: ");
        horas = input.nextDouble();

        System.out.println("Informe a potência do seu equipamento em Watts: ");
        potencia = input.nextDouble();

        System.out.println("Informe o preço do KW/h: ");
        valorKWh = input.nextDouble();

        kwGasto = (potencia * horas) / 1000;

        calcGasto = kwGasto * valorKWh;
        
        System.out.println("A quantidade de KW/h gasto é de " + kwGasto + ". Gerando um custo de: " + calcGasto);

        input.close();
    }
}
