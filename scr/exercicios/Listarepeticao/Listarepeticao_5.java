// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. 

package Listarepeticao;

import java.util.Scanner;

public class Listarepeticao_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, soma, n;
        soma = 0;
        n = 0;
        i = 0;

        while(i<10){
            i = i++;
            System.out.println("Insira um numero:");
            n = scan.nextInt();
            soma = soma + n;         
        }
        System.out.println("A soma é:"+ soma);
        scan.close();
    }
    
}