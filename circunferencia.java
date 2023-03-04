import java.util.Scanner;
import java.lang.Math. *;

public class circunferencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Area: ");
        float raio = sc.nextInt();
        double area = Math.PI ;
        float areaF = (float)area;
        float result = areaF  * raio * raio;
        System.out.println("A area da circunferencia é igual á: " + result +"cm2");
    
    }
}
