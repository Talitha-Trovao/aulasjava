// Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. 
// corrigir

package exercicios;
import java.util.Scanner;

public class Listarepeticao_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, maiores;
        maiores = 0;
        n = 0;
        i = 0;

        while(i<3){
            i = i++;
            System.out.println("Insira 3 idades de pessoas (uma por vez):");
            n = scan.nextInt();
            
            if(n > 18){
                maiores = maiores + 1;
            }
            System.out.println("Das pessoas, temos " + maiores + " maiores de idade.");
        
        }
        scan.close();
    }
    
}