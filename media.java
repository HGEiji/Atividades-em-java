import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,n3,n4,media;

        System.out.println("Nota 1: ");
        n1 = sc.nextFloat();

        System.out.println("Nota 2: ");
        n2 = sc.nextFloat();

        System.out.println("Nota 3: ");
        n3 = sc.nextFloat();

        System.out.println("Nota 4: ");
        n4 = sc.nextFloat();

        media = (n1 + n2 + n3 + n4)/4;

        if (media >= 7){
            System.out.print("Parabens sua media foi satisfatora :" + media);
        }else{
            System.out.print("Infelizmente sua media não atigiu o minimo, sua media foi: " +media );
        }
    }
}
