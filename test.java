import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int [] lista = new int[10];
        int tamanho = 0;

        do{
            System.out.println("1 - add elemento no final da lista");
            System.out.println("2 - add elemento no começo da lista");
            System.out.println("3 - remover elemento no inicio da lista");
            System.out.println("4 - remover elemento no final da lista");
            System.out.println("5 - mostrar lista");
            System.out.println("6 - sair");
            
            op = sc.nextInt();
         
            if(op == 1 ){
                System.out.print("Valor : ");
                int valor = sc.nextInt();
                lista[tamanho] = valor;
                tamanho++;
                
            }else if (op == 2) {
                System.out.println("Valor : ");
                int valor = sc.nextInt();
                for(int i = tamanho; i>0;i--){
                    lista[i]= lista[i-1];
                }
                lista[0]= valor;
                tamanho++;
            }else if ( op == 3){
                int remover = lista[0];
                for(int i = 0; i<tamanho; i++){
                    lista[i] = lista [i +1];
                }
                tamanho--;
                System.out.println("Numero " + remover + " Removido.");
                
            }else if (op == 4){
                int remover2 = lista[tamanho - 1];
                tamanho--;
                System.out.println("Numero " + remover2 + " Removido.");
            }
            else if(op == 5) {
                System.out.println(Arrays.toString(lista));
            }else if (op == 6){
                System.out.println("Programa fechado");
            }
        }while(op != 6);
    }
}