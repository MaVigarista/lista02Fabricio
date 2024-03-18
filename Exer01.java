//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).

package lista02;

import java.util.Scanner;


public class Exer01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, horasEmMinutos, minutosTotais;

        System.out.print("Escreva as horas de agora (00): ");
        horas = input.nextInt();

        System.out.print("Escreva os minutos de agora (00): ");
        minutos = input.nextInt();

        horasEmMinutos = horas * 60;

        minutosTotais = horasEmMinutos + minutos;

        System.out.print("Considerando esse horário, o dia já teve " + minutosTotais + "minutos até agora!");
        
        input.close();
    }
}