//Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 

package lista02;
import java.util.*;

public class Exer03 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double numeroA, numeroB, numeroC;

        System.out.print("Escreva o valor de A e B: ");
        numeroA = input.nextDouble();
        numeroB = input.nextDouble();

        numeroC = Math.sqrt(Math.pow(numeroA, 2) + Math.pow(numeroB, 2));

        System.out.print("O seu teorema de Pítagoras calculado resulta em: " + numeroC);
        input.close();
    }
}
