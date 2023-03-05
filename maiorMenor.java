import java.util.Scanner;
public class maiorMenor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num,menor,maior;

        System.out.print(" Digite 5 numero: ");
        num = sc.nextInt();
        maior = num;
        menor = num;

        for(int i = 2; i <= 5; i++){
            System.out.print("Digite o " + i + "º número: ");
            num = sc.nextInt();
            if (num >maior){
                maior = num;
               
            }if (num < menor){
                menor = num;
            
            }
        }
        System.out.println("O maio numero digito foi: " + maior);
        System.out.println("O menor numero digita foi: " +menor);
    }
}
