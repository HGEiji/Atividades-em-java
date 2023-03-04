import java.util.Scanner;
public class alo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("1 - Ler 2 números inteiros e mostrar o resultado");
            System.out.println("2 - Ler 1 número real e mostrar quanto é 50% desse valor");
            System.out.println("99 - Sair");
            op = sc.nextInt();
            if (op==1){
               int x,y,r;
               System.out.println("Digite o 1o. valor: ");
               x = sc.nextInt();
               System.out.println("Digite o 2o. valor: ");
               y = sc.nextInt();
               r = x + y;
               System.out.println("Soma = " + r);
            }else if (op==2){
                //ler 1 número real
                double a, w;
                System.out.println("Digite o valor: ");
                a = sc.nextDouble();
                //calcular 50%
                w = a * 0.5;
                //exibir o resultado
                System.out.println("Soma = " + w);
            }else if (op==99){
                System.out.println("Saindo....");
            }else {
                System.out.println("Erro! Opção Inválida!");
            }
        }while(op!=99);
       
    }
}