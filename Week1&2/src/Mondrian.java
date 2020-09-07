import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Graphics;


public class Mondrian extends JComponent {
    int width, height;

    public Mondrian(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // 500 x 500
    public void paint(Graphics g) {
        // Rectangles
        g.setColor(new Color(255, 55, 0));
        g.fillRect(100, 0, 400, 400);
        g.setColor(new Color(65, 97, 198));
        g.fillRect(0, 400, 100, 100);
        g.setColor(new Color(255, 228, 0));
        g.fillRect(470, 440, 30, 60);

        // Lines
        g.setColor(new Color(0, 0, 0));
        g.drawLine(100, 0, 100, 500);
        g.drawLine(101, 0, 101, 500);
        g.drawLine(102, 0, 102, 500);
        g.drawLine(103, 0, 103, 500);

        g.drawLine(0, 400, 500, 400);
        g.drawLine(0, 401, 500, 401);
        g.drawLine(0, 402, 500, 402);
        g.drawLine(0, 403, 500, 403);

        g.drawLine(0, 120, 100, 120);
        g.drawLine(0, 121, 100, 121);
        g.drawLine(0, 122, 100, 122);
        g.drawLine(0, 123, 100, 123);
        g.drawLine(0, 124, 100, 124);
        g.drawLine(0, 125, 100, 125);
        g.drawLine(0, 126, 100, 126);
        g.drawLine(0, 127, 100, 127);
        g.drawLine(0, 128, 100, 128);

        g.drawLine(470, 400, 470, 500);
        g.drawLine(471, 401, 471, 500);
        g.drawLine(472, 402, 472, 500);
        g.drawLine(473, 403, 473, 500);

        g.drawLine(470, 440, 500, 440);
        g.drawLine(471, 441, 500, 441);
        g.drawLine(472, 442, 500, 442);
        g.drawLine(473, 443, 500, 443);

        // Triangles
        g.setColor(new Color(255, 255, 255));
        g.fillPolygon(new Polygon(new int[] {0, 0, 250}, new int[] {0, 125, 0}, 3));
        g.fillPolygon(new Polygon(new int[] {250, 500, 500}, new int[] {0, 125, 0}, 3));
        g.fillPolygon(new Polygon(new int[] {0, 0, 250}, new int[] {0, 125, 0}, 3));
        g.fillPolygon(new Polygon(new int[] {0, 0, 250}, new int[] {0, 125, 0}, 3));

        // Lines Second stage
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(new Color(255, 255, 255));
        g2.setStroke(new BasicStroke(40));
        g2.drawLine(0, 250, 250, 500);
        g2.setStroke(new BasicStroke(45));
        g2.drawLine(500, 250, 200, 430);
        g2.setStroke(new BasicStroke(30));
        g2.drawLine(450, 500, 350, 380);
        g2.setStroke(new BasicStroke(15));
        g2.drawLine(500, 360, 450, 300);

        // Lines Second stage
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("TIMES NEW ROMAN", Font.ITALIC, 20));
        g.drawString("SB KIM influenced by Piet Mondrian ", 130, 250);
    }
}
