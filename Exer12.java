//Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.

package lista02;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double horas, potencia, valorKWh, calcGasto, kwGasto, calcGastoMes;

        System.out.println("Informe quantas horas o seu equipamento fica ligado por dia: ");
        horas = input.nextDouble();

        System.out.println("Informe a potência do seu equipamento em Watts: ");
        potencia = input.nextDouble();

        System.out.println("Informe o preço do KW/h: ");
        valorKWh = input.nextDouble();

        kwGasto = (potencia * horas) / 1000;

        calcGasto = kwGasto * valorKWh;

        calcGastoMes = calcGasto * 30;
        
        System.out.println("A quantidade de KW/h gasto é de " + kwGasto + ". Gerando um custo de: R$" + calcGasto + " por dia! \nE de R$" + calcGastoMes + " por mês!");

        input.close();
    }
}
