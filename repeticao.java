import java.util.*;

public class repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 6;
        do {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            op = sc.nextInt();
            
            switch(op){
                case 01:
                System.out.println("OP 1");
                break;
                case 02:
                System.out.println("OP 2");
                break;
                case 03:
                System.out.println("OP 3");
                break;
                case 04:
                System.out.println("OP 4");
                break;
                case 05:
                System.out.println("OP 5");
                break;
                case 06:
                System.out.println("OP 6");
                break;
             }
                
         } while(op != 6);
    }
}
