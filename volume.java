import java.util.Scanner;

public class volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        
        System.out.println("Raio: ");
        float raio = sc.nextFloat();   
        System.out.println("Altura: ");
        float altura = sc.nextFloat();
        System.out.println("Volume: ");
        double volumed =  3.14159;
        float volumeF = (float)volumed;
        float op = volumeF * raio * raio *altura;
        System.out.println("O volume é igual á: " + op);
    }
}
