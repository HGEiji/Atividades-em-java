import java.util.Scanner;

public class temp {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Graus em fahrenheit ");
        float f = sc.nextFloat();
        double c = (f-32)/1.8;
        System.out.println("Em celsius são: " + c +"o");
    }
}
 