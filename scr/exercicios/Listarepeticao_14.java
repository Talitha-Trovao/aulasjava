// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 
// 100, quantos estão entre 101 e 200 e quantos são maiores de 200.

package exercicios;
import java.util.Scanner;

public class Listarepeticao_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0, n=0; 
        int ncemmenos = 0, ncemmais = 0; 

        while(i<20){
            i = i++;
            System.out.println("Digite 20 números: ");
            n = scan.nextInt();

            if(n >= 0 && n <= 100){
                ncemmenos = ncemmenos+1;
            }

            if(n >100 && n <= 200){
                ncemmais = ncemmais+1;
            }
            System.out.println("dos 20 números, "+ncemmenos+" estão entre 0 e 100 e "+ncemmais+" estão entre 101 e 200.");

        scan.close();
    }
    }
    
}