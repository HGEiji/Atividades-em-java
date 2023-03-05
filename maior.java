import java.util.Scanner;

public class maior{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, controle;

        System.out.println("Primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Terceiro número: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) {
            controle = n1;
            n1 = n3;
            System.out.println("O maior número é: " + controle);

        } else if (n1 < n2 && n2 > n3) {
            controle = n2;
            n2 = n1;
            n1 = n3;
            System.out.println("O maior número é: " + controle);

        } else if (n1 > n2 && n2 < n3) {
            controle = n1;
            n1 = n3;
            n3 = n2;
            System.out.println("O maior nuúmero é: " + controle);
        } else {
            System.out.println("O maio número é: "  + n3);
        }

    }
}