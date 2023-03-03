// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100. 
package exercicios;
import java.util.Scanner;

public class Listarepeticao_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0, n=0; 
        int nvalido =0; 

        while(i<20){
            i = i++;
            System.out.println("Digite 20 números: ");
            n = scan.nextInt();

            if(n >= 0 && n <= 100){
                nvalido = nvalido+1;

            }
            System.out.println("dos 20 números, "+nvalido+" estão entre 0 e 100.");

        scan.close();
    }
    
    }
}