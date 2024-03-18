//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.

package lista02;
import java.util.*;


public class Exer05 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double base, altura, area, perimetro, diagonal;

        System.out.print("Insira a base do triângulo: ");
        base = input.nextDouble();

        System.out.print("Insira a altura do triângulo: ");
        altura = input.nextDouble();

        area = (base * altura) / 2;

        perimetro = (altura * 2) + base;

        diagonal = Math.sqrt(Math.pow(area, 2) + Math.pow(base, 2));

        System.out.print("A área do triângulo é equivalente a: " + area);
        System.out.print("\n O perímetro do triângulo é equivalente a: " + perimetro);
        System.out.print("\n A diagonal do triângulo é equivalente a: " + diagonal);

        input.close();
    }
}
