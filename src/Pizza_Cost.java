import java.util.Scanner;

public class Pizza_Cost {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double top, size, answer;
        
        System.out.println("Enter the diameter of pizza in inches: ");
        size = scan.nextDouble();
        
        System.out.println("Enter the number of toppings: ");
        top = scan.nextDouble();
        
        answer = 1.5 + .75 + (.75 * top) + (.50 * size);
        
        System.out.println("your pizza will cost: " + answer);
        
    }
    
}
