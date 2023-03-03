// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares 
package Listarepeticao;

import java.util.Scanner;

public class Listarepeticao_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0, n=0; 
        int npar =0;    

        while(i<20){
            i = i++;
            System.out.println("Digite 20 números: ");
            n = scan.nextInt();

            if(n % 2 == 0){
                npar = npar+1;
            }
            System.out.println("dos 20 números, "+npar+" são pares.");
        scan.close();

        }
    }
    
}