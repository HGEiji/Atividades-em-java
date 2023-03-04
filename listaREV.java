import java.util.Scanner;
import java.util.ArrayList;

public class listaREV {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op != 6){
            System.out.println("1 - add elemento no final da lista");
            System.out.println("2 - add elemento no começo da lista");
            System.out.println("3 - remover elemento no inicio da lista");
            System.out.println("4 - remover elemento no final da lista");
            System.out.println("5 - mostrar lista");
            System.out.println("6 - sair");

            op = sc.nextInt();

            switch(op){
            case 01 :
                System.out.println("Adicionar elemento no final da lista: ");
                int element1= sc.nextInt();
                lista.add(element1);
                break;
            case 02 :
                System.out.println("Adicionar no começo da lista: ");   
                int element2 = sc.nextInt();
                lista.add(0,element2);
                break;
            case 03 :
                int remov1 = lista.get(0);
                lista.remove(0);
                System.out.println("Valor "+remov1+" removido do inicio.");
                break;
            case 04:
                int remov2 = lista.get(lista.size()-1);
                lista.remove(lista.size()-1);
                System.out.println("Valor "+remov2+" removido do inicio.");
                break;
            case 05:
                System.out.println("Mostrar lista: ");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
                break;
            case 06:
                System.out.println("Programa encerrado");
            default:
                System.out.println("eroor");
                
            }    
        
        }


    }
}
