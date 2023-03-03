import java.util.Scanner;
public class atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 3;
        //float n1,n2,n3;

        do{
            System.out.println("1 - Calcular e Exibir a Média Aritmética de Duas Notas (Números Reais)");
            System.out.println("2 - Calcular e Exibir a Média Ponderada de Três Notas (Números Reais)");
            System.out.println("3 - Sair ");
            op = sc.nextInt();
            switch(op){
            case 01:
                System.out.println("Primeira nota: ");
                float n1 = sc.nextFloat();
                System.out.println("Segunda nota: ");
                float n2 = sc.nextFloat();
                float result = ((n1*3)+(n2*2))/5;
                
                System.out.printf("A media 1 é igual a : %.2f ", result);
                break;

            case 02:
                System.out.println("Primeira nota: ");
                float nota1 = sc.nextFloat();
                System.out.println("Segunda nota: ");
                float nota2 = sc.nextFloat();
                System.out.println("Terceira nota: ");
                float nota3 = sc.nextFloat(); 
                float result2 = ((nota1*3)+(nota2*2)+(nota3*5))/10;

                System.out.printf("A media 2 é igual a : %.2f", result2);
                break;

            case 03:
                System.out.println("Saindo");
                break;
         
            
        }
         }while(op != 3);

    }
}
