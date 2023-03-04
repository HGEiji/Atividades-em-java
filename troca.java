import java.util.Scanner;

public class troca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b,troca;
        System.out.print("Valor de A: ");
        a = sc.nextInt();
        System.out.print("Valor de B: ");
        b = sc.nextInt();
        
        troca = a;
        a = b;
        b = troca;
        System.out.println("A é igua: "+a+ " | B é igual: "+b);
    }
}
