package Data_manip;

import java.util.Date;

public class Datas {
    static final long ms_dia = 1000*60*60*24;
    public static void main(String[] args) {
        Date date = new Date();
        long tempo = date.getTime();
        System.out.println("# milissegundos: "+tempo); //contagem de milissegundos ddesde 1o de jan de 1970 té a hora do sistema 
        System.out.println("Data: "+ date);

        Date date2 = new Date(date.getTime() + ms_dia*10);
        System.out.println(date2);

        StringBuilder sb = new StringBuilder();
        sb.append("Ms");
        sb.append(date);
        sb.append("\ndias: ");
        sb.append(tempo/ms_dia);

        System.out.println(sb.toString());
    }
    
}