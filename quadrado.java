import java.util.Scanner;
public class quadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual numero vc deseja tranformar ? ");
        int numero = sc.nextInt();
        int op = numero * numero;
        System.out.println("O resultado é : " +op);

    }
}
