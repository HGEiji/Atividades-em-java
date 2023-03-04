import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int diaAno = 365;
        int mesAno =30;
        
        System.out.print("Sua Idade: ");
        int ano = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Dias: ");
        int dias = sc.nextInt();

        int resultado = dias + (ano * diaAno) + (mes * mesAno);
        System.out.println("Sua idade em dias é :" + resultado);
    }
}
