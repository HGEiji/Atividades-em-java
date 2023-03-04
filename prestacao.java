import java.util.Scanner;
public class prestacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor: ");
        float valor = sc.nextFloat();
        System.out.print("Digite o valor da taxa: ");
        float taxa = sc.nextFloat();
        System.out.print("Digite o tempo de atraso: ");
        float tempo = sc.nextFloat();

        float prestacao = valor +(valor*(taxa/100)*tempo);
        System.out.println("O valor da sua pretação esta e: " + prestacao);
    }
}
