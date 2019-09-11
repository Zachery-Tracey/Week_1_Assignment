import java.util.Scanner;

public class Momentum {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass, velocity, answer;
        
        System.out.println("Enter the mass in kg's: ");
        mass = scan.nextDouble();
        
        System.out.println("Enter the velocity in meters/second: ");
        velocity = scan.nextDouble();
        
        answer = mass * velocity;
        
        System.out.format("You entered the number %.2f\n", answer);
    }
    
}
