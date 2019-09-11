import hsa.Console;
import java.awt.Color;

public class Bar {
    int xloc, height;
    Color col;
    public void draw(Console c){
        c.setColor(col);
        int yloc = 400 - height;
        c.fillRect(xloc, 400-height, 50, height);
        c.drawString("Value: " + height, xloc, yloc-10);
        
    }
}
