import java.awt.Graphics;
import javax.swing.JFrame;

public class Lab02 {

    public static void main(String[] args) {
        JFrame a = new JFrame();
        int width = 500, height = 500;
        a.setVisible(true);
        a.setSize(width+20, height+40);
        // sign (+ or -) is necessary for a.setSize
        // how can you determine 20, 40 dynamically?
        // -> It depends on the size of my image.
        // -> By adjusting the values, I can remove blank side over my picture.
        Mondrian b = new Mondrian(width, height);
        a.add(b);
    }
}
