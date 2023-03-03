// Crie um programa que leia o número de dias trabalhados em um mês e
// mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por
// dia e ganha R$25 por hora trabalhada.

package exercicios;

import java.util.Scanner;

public class Lista1_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos dias foram trabalhados: ");
        int dias = scan.nextInt();

        if(dias > 31 || dias < 0){
            System.out.println("Dia inválido!");
        }
        else{
            int salario = dias*8*25;
            System.out.println("O salário será de R$"+salario);
        }
        scan.close();
        
    }
    
}