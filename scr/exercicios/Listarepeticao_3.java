// Escreva um algoritmo que calcule a soma dos números de 1 a 15

package exercicios;

import java.util.Scanner;

public class Listarepeticao_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        i=0;
        String nome;

        System.out.println("Insira seu nome:");
        nome = scan.nextLine();

        while(i<=10){
            i=i+1;
            System.out.println(nome);
        }
        scan.close();
    }
}