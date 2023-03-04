import java.util.Scanner;
import java.util.Arrays;

public class listaTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valores da lista");
        int [] lista = new int[10];
        for (int i= 0; i<lista.length;i++){
            lista[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(lista));
    }
}