import hsa.Console;
import java.awt.Color;
import java.util.Scanner;

public class Bar_Chart_1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b1h, b2h, b3h, b4h, xloc1, xloc2, xloc3, xloc4;
        
        xloc1 = 100;
        xloc2 = 200;
        xloc3 = 300;
        xloc4 = 400;
        
        System.out.println("Enter value 1 (max 450): ");
        b1h = scan.nextInt();
        
        System.out.println("Enter value 2 (max 450): ");
        b2h = scan.nextInt();
        
        System.out.println("Enter value 3 (max 450): ");
        b3h = scan.nextInt();
        
        System.out.println("Enter value 4 (max 450): ");
        b4h = scan.nextInt();
        
        Console c = new Console();
        
        c.setColor(Color.green);
        int yloc = 400 - b1h;
        c.fillRect(xloc1, 400-b1h, 50, b1h);
        c.drawString("Value: " + b1h, xloc1, yloc-10);
        
        c.setColor(Color.red);
        int yloc2 = 400 - b2h;
        c.fillRect(xloc2, 400-b2h, 50, b2h);
        c.drawString("Value: " + b2h, xloc2, yloc2-10);
        
        c.setColor(Color.blue);
        int yloc3 = 400 - b3h;
        c.fillRect(xloc3, 400-b3h, 50, b3h);
        c.drawString("Value: " + b3h, xloc3, yloc3-10);
        
        c.setColor(Color.black);
        int yloc4 = 400 - b4h;
        c.fillRect(xloc4, 400-b4h, 50, b4h);
        c.drawString("Value: " + b4h, xloc4, yloc4-10);
    }
    
}
