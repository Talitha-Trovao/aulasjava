// Descreva em no máximo 200 palavras o que é um automóvel e o que
// ele faz. Liste os substantivos e verbos separadamente. Cada substantivo corresponde
// a um objeto que precisará ser construído para implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos que você listou e, para cada um, liste vários
// atributos e comportamentos. Descreva brevemente como esses objetos interagem
// entre si e com outros objetos na sua descrição. Estes passos que você seguiu são
// típicos do projeto orientado a objetos

package Orientacaoobjetos.OO_Ex1;
// aqui se referencia as classes e atributos. Aqui se retorna resultados para o usuário
public class Carro_acoes {
    public static void main(String[] args) {
        Carro_atributos meucarro = new Carro_atributos(); //metodo construtor para fazer uma instancia
        meucarro.cor = "preto";
        meucarro.modelo = "Uno";
        meucarro.nmarchas = 5;
        meucarro.liga(false);
        
        System.out.println("Meu carro é um "+meucarro.modelo+" da cor "+meucarro.cor);


    }
    
}