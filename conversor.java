import java.util.Scanner;

public class conversor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a cotação do dolar ? ");
        float cotDolar = sc.nextFloat();
        System.out.print("Quantos  reais vc deseja converter ? ");
        float real = sc.nextFloat();

        float conver = real * cotDolar;
        System.out.println("O valor convertido em real é igual á: " + conver + "R$");
        
    }
}
