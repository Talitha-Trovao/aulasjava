// A fim de representar empregados em uma firma, crie uma classe
// chamada Empregado que inclui as três informações a seguir como atributos: • um primeiro nome, • um sobrenome, 
//e • um salário mensal. Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
// método set e get para cada atributo. Se o salário mensal não for positivo, configure- o como 0.0. 
//Escreva um aplicativo de teste que demonstra as capacidades da classe. 
//Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a
// cada empregado um aumento de 10% e exiba novamente o salário anual de cada
// empregado


package Orientacaoobjetos.OO_Ex3;

public class Empregado_atributos {

    private String nome;
    private String sobrenome;
    private double salario;
    private String Empregado;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;


        if (salario < 0)
            salario = 0.0;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
//salario recebido no ano
    public double getSalarioano(){
        return getSalario() * 12;
    }
//salario com aumento
    public void setAumento() {
        double novoSalario = getSalario() * 1.10 ;
        this.setSalario(novoSalario);
    }
}
    