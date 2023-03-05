import java.util.Scanner;
public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,verf,resul;
        System.out.print("Numero: ");
        num = sc.nextInt();
        verf = 2;
        resul = num % verf;
        if (resul == 0){

            System.out.print("O numero " + num + " é par!");

        }else{
            System.out.println("O numero " + num + " é impar!");
        }
    }
    
}




