import java.util.*;
public class lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Codigo: ");
        int pedido = sc.nextInt();
        
        if (pedido == 100){
            System.out.println("Quantos Cachorro(s) quente(s)?");
            int quantidade = sc.nextInt();
            float preco = 1.20f;
            float valorFinal = quantidade * preco;
            System.out.printf("O preço final fica: %.2f R$", valorFinal);

        }else if (pedido == 101){
            System.out.println("Quantos Baurus Simples?");
            int quantidade = sc.nextInt();
            float preco = 1.30f;
            float valorFinal = quantidade * preco;
            System.out.printf("O preço final fica: %.2f R$", valorFinal);

        }else if (pedido == 102){
            System.out.println("Quantos Baurus com Ovo?");
            int quantidade = sc.nextInt();
            float preco = 1.50f;
            float valorFinal = quantidade * preco;
            System.out.printf("O preço final fica: %.2f R$", valorFinal);

        }else if (pedido == 103){
            System.out.println("Quantos Hamburger(s)?");
            int quantidade = sc.nextInt();
            float preco = 1.20f;
            float valorFinal = quantidade * preco;
            System.out.printf("O preço final fica: %.2f R$", valorFinal);

        }else if (pedido == 104){
            System.out.println("Quantos Cheeseburger(s)?");
            int quantidade = sc.nextInt();
            float preco = 1.30f;
            float valorFinal = quantidade * preco;
            System.out.printf("O preço final fica: %.2f R$", valorFinal);

        }else if (pedido == 105){
            System.out.println("Quantos Refrigerante(s)?");
            int quantidade = sc.nextInt();
            float preco = 1.00f;
            float valorFinal = quantidade * preco;
            System.out.printf("O preço final fica: %.2f R$", valorFinal);

        }
    }
}
