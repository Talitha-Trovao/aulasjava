
// Faça um algoritmo que leia o salário de um funcionário, calcule e
// mostre o seu novo salário, com 15% de aumento.

package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista1_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Digite o valor do salário: ");
        double salario = scan.nextDouble();

        double novosalario = salario*(1.15);

        System.out.println("O salário R$"+df.format(salario)+" com aumento de 15% será R$"+df.format(novosalario));

        scan.close();
        
    }
    
}