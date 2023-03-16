package Orientacaoobjetos.OO_Ex3;

public class Empregado_acoes {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Andre", " S", 3000);
        System.out.println("Empregado: " + empregado1.getNome() + " " + empregado1.getSobrenome() + " Salário mensal: " + empregado1.getSalario() + "Salário anual: " + empregado1.getSalarioano());

        Empregado empregado2 = new Empregado("MAria", "J", 5000);
        System.out.println("Empregado: " + empregado2.getNome() + " " + empregado2.getSobrenome() + " Salário mensal: " + empregado2.getSalario() + "Salário anual: " + empregado2.getSalarioano());

//salario com aumento
        empregado1.setAumento();
        System.out.println("Empregado: " + empregado1.getNome());
        System.out.println("Salário reajustado: " + empregado1.getSalario());
        System.out.println("Salário reajustado: " + empregado1.getSalario());

        empregado2.setAumento();
        System.out.println("Empregado: " + empregado2.getNome());
        System.out.println("Salário reajustado: " + empregado2.getSalario());
        System.out.println("Salário reajustado: " + empregado2.getSalario());
    }
    
    
}