
// [deitel] Crie uma classe chamada Invoice que possa ser utilizado por
// uma loja de suprimentos de informática para representar uma fatura de um item
// vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
//  o número do item faturado,  a descrição do item,  a quantidade comprada do item
//  o preço unitário do item. Sua classe deve ter um construtor que inicialize os quatro atributos. Se a
// quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item
// não for positivo ele deve ser configurado como 0.0. Contrutores, Livro Java Ensido
// Didático, Capítulo 7. Página 115. Forneça um método set e um método get para cada variável de instância. Além
// disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura
// (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como
// um double. Escreva um aplicativo de teste que demonstra as capacidades da classe invoice.



package Orientacaoobjetos.OO_Ex2;

import javax.lang.model.util.AbstractAnnotationValueVisitor14;

public class Invoice_atributos {
    int item;
    String descricaoitem;
    int qte_item;
    double valor_item;
    double valor_total;
    
    public void invoice(String[] args) {
        private void numero_item(qte_item) {
            if(qtde_item = 0){
                this.valor_item = 0;
                this.descricaoitem = "Não se aplica.";
                this.item = 0;
            }else{
                this.item = item;
                this.valor_item = valor_item;
                this.qtde_item = qtde_item;
                this.descricaoitem = descricaoitem;
            }
                        
        }
        private void getInvoiceAmount(qte_item) {
            if(qte_item > 1){
                this.valor_total = valor_item * qte_item;
AbstractAnnotationValueViitor14
            }
            
        }
        
    }
    
}