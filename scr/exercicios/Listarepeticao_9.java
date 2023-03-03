// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 

package exercicios;

import java.util.Scanner;

public class Listarepeticao_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String maisnovo = "";
        int idademenor = Integer.MAX_VALUE, i = 0;


        while(i<10){
            i = i++;
            System.out.println("Nome da pessoa:");
            String nome = scan.nextLine();

            System.out.println("informe a idade da pessoa:");
            int idade = scan.nextInt();

            if(idade == 0 ||idade <= idademenor ){
                idademenor = idade;
                maisnovo = nome;
                System.out.println("A pessoa mais nova é "+maisnovo+" e tem "+idademenor+" anos.");
            }
            
        }
        scan.close();
    }
    
}