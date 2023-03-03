// Escreva um algoritmo que calcule a soma dos números de 1 a 15


package exercicios;

public class Listarepeticao_2 {
    public static void main(String[] args) {
        int i;
        int soma;
        i = 1;
        soma = 0;

        while(i<=15){
            i = i+1;    
            soma = soma + i;
            System.out.println("A soma dos numeros é "+ soma);
            }
        
    }
    
}