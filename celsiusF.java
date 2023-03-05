public class celsiusF {
    public static void main(String[] args) {
        double c,f;
        
        for(c = 0; c<=100; c+=10){
            f=(c*1.8) + 32;
            System.out.println("Graus celsius: " + c + "Graus em fahrenheit: " + f);
        }
    }
}
