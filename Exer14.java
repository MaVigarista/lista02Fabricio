//Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 .

package lista02;
import java.util.Scanner;


public class Exer14 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double x1, y1, x2, y2, calculo;

        System.out.println("Informe o primeiro ponto (X e Y): ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.println("Informe o segundo ponto (X e Y): ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        calculo = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.println("A distância entre os dois pontos é de: " + calculo);

        input.close();
    }
}
