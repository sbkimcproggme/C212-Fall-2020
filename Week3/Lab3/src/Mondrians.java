import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Mondrians extends JComponent {
    public static void main(String[] args) {
        JFrame drawingpaper = new JFrame();
        drawingpaper.setVisible(true);
        int width = 500, height = 500;
        drawingpaper.setSize(width+20, height+40);
        Mondrians mydrawing = new Mondrians(width, height);
        drawingpaper.add(mydrawing);
    }

    Mondrian resize1, resize2, resize3;
    int width, height;
    public Mondrians(int width, int height) {
        this.width = width;
        this.height = height;
        resize1 = new Mondrian(10, 10, 0.3);
        resize2 = new Mondrian(100, 100, 0.6);
        resize3 = new Mondrian(290, 290, 0.4);

    }
    public void paintComponent(Graphics g){
        resize1.paint(g);
        resize2.paint(g);
        resize3.paint(g);

    }
}
