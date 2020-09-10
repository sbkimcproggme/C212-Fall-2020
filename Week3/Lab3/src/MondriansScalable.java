import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class MondriansScalable extends JComponent {
    public static void main(String[] args) {
        JFrame drawingpaper = new JFrame();
        drawingpaper.setVisible(true);
        int width = 500, height = 500;
        drawingpaper.setSize(width+20, height+40);
        MondriansScalable mydrawing = new MondriansScalable(width, height);
        drawingpaper.add(mydrawing);
    }

    MondrianScalable resize1, resize2, resize3;
    int width, height;
    public MondriansScalable(int width, int height) {
        this.width = width;
        this.height = height;
        resize1 = new MondrianScalable(20, 50, 0.3);
        resize2 = new MondrianScalable(220, 20, 0.5);
        resize3 = new MondrianScalable(40, 230, 0.4);

    }
    public void paintComponent(Graphics g){
        resize1.paint(g);
        resize2.paint(g);
        resize3.paint(g);

    }
}
