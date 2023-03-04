import java.util.Scanner;
public class resto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor pra divisão por 6: ");
        int numero = sc.nextInt(); 
        int divisor = 6 ;
        float resto = numero % divisor;
        System.out.println("O resto da divião é " + resto);
    }  
}
