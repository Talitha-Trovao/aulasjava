package Orientacaoobjetos.OO_Ex2;
import java.text.DecimalFormat;

public class Invoice_acoes {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();

        Invoice invoice = new Invoice(10001, "Iphone S50", 2, 5000.00);
        df.applyPattern("R$ #,##0.00");

        
        System.out.println("Produto: " + invoice.getDescricaoItem());
        System.out.println("Quantidade: " + invoice.getQuantidadeCompradaItem());
        System.out.println("Preço Unitário" + df.format(invoice.getPrecoUnitarioItem()));
        System.out.println("Valor total da compra: " + df.format(invoice.getInvoiceAmount()));
    }
}