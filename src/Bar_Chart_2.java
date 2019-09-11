
import hsa.Console;
import java.awt.Color;
import java.util.Scanner;

public class Bar_Chart_2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int b1h, b2h, b3h, b4h;
        
        System.out.println("Enter value 1: ");
        b1h = scan.nextInt();
        
        System.out.println("Enter value 2: ");
        b2h = scan.nextInt();
        
        System.out.println("Enter value 3: ");
        b3h = scan.nextInt();
        
        System.out.println("Enter value 4: ");
        b4h = scan.nextInt();
        
        Console c = new Console();
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        Bar b3 = new Bar();
        Bar b4 = new Bar();
        
        b1.xloc = 100;
        b1.height = b1h;
        b1.col = Color.red;
        
        b2.xloc = 200;
        b2.height = b2h;
        b2.col = Color.green;
        
        b3.xloc = 300;
        b3.height = b3h;
        b3.col = Color.orange;
        
        b4.xloc = 400;
        b4.height = b4h;
        b4.col = Color.black;
        
        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);
        
    }
    
}
