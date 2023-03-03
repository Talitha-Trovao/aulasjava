// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8. 
package Listarepeticao;

import java.util.Scanner;

public class Listarepeticao_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0, n=0; 
        int contagem =0;    

        while(i<20){
            i = i++;
            System.out.println("Digite 20 números: ");
            n = scan.nextInt();

            if(n>8){
                contagem = contagem+1;
            }
            System.out.println("dos 20 números, "+contagem+" são maiores que 8.");
        scan.close();

        }

    }
    
}