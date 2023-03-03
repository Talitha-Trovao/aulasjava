// Faça um programa que leia um número inteiro e mostre o seu antecessor
// e seu sucessor.

package exercicios;

import java.util.Scanner;

public class Lista1_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = scan.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O antecessor de "+num+ " é "+antecessor+" e o sucessor é "+sucessor);
        
        scan.close();
         }
    
}