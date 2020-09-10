import java.awt.*;

public class Mondrian{
    int x, y;
    double scale;
    public Mondrian(int x, int y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    private int scale(int size){

        return (int)(this.scale * size);
    }
    public void paint(Graphics g) {
        // Rectangles
        g.setColor(Color.WHITE);
        g.fillRect(x, y, scale(500), scale(500));
        g.setColor(Color.WHITE);
        g.drawRect(x, y, scale(500), scale(500));

        g.setColor(new Color(255, 55, 0));
        g.fillRect(x+scale(100), y+scale(0), scale(400), scale(400));

        g.setColor(new Color(65, 97, 198));
        g.fillRect(x+scale(0), y+scale(400), scale(100), scale(100));

        g.setColor(new Color(255, 228, 0));
        g.fillRect(x+scale(470), y+scale(440), scale(30), scale(60));

        // Lines
        g.setColor(new Color(0, 0, 0));
        int xind = 100;
        for (int xforloop=0; xforloop<4; xforloop++){
            g.drawLine(x+scale(xind),y+scale(0), x+scale(xind),y+scale(500));
            xind++;
        }
        int yind = 400;
        for (int xforloop=0; xforloop<4; xforloop++){
            g.drawLine(x+scale(0),y+scale(yind), x+scale(500),y+scale(yind));
            yind++;
        }
        int yind2 = 120;
        for (int xforloop=0; xforloop<9; xforloop++){
            g.drawLine(x+scale(0),y+scale(yind2), x+scale(100),y+scale(yind2));
            yind2++;
        }
        int xind2 = 470, yind3 = 400;
        for (int xforloop=0; xforloop<4; xforloop++){
            g.drawLine(x+scale(xind2),y+scale(yind3), x+scale(xind2), y+scale(500));
            xind2++;
            yind3++;
        }
        int xind3 = 470, yind4 = 440;
        for (int xforloop=0; xforloop<4; xforloop++){
            g.drawLine(x+scale(xind3),y+scale(yind4), x+scale(500), y+scale(yind4));
            xind3++;
            yind4++;
        }

        // Triangles
        g.setColor(new Color(255, 255, 255));
        g.fillPolygon(new Polygon(new int[] {x+scale(0), x+scale(0), x+scale(250)}, new int[] {y+scale(0), y+scale(125), y+scale(0)}, 3));
        g.fillPolygon(new Polygon(new int[] {x+scale(250), x+scale(500), x+scale(500)}, new int[] {y+scale(0), y+scale(125), y+scale(0)}, 3));
        g.fillPolygon(new Polygon(new int[] {x+scale(0), x+scale(0), x+scale(250)}, new int[] {y+scale(0), y+scale(125), y+scale(0)}, 3));
        g.fillPolygon(new Polygon(new int[] {x+scale(0), x+scale(0), x+scale(250)}, new int[] {y+scale(0), y+scale(125), y+scale(0)}, 3));

        // Drawing Lines - Step2 (Thicker than the first step)
        g.setColor(new Color(48, 76, 203));
        int xind10 = 250, yind10 = 250;
        for (int xforloop=0; xforloop<40; xforloop++){
            g.drawLine(x+scale(0),y+scale(yind10), x+scale(xind10),y+scale(500));
            yind10++;
            xind10++;
        }
        g.setColor(new Color(227, 56, 183));
        int xind20 = 500, xind21 = 200, yind21 = 430;
        for (int xforloop=0; xforloop<45; xforloop++){
            g.drawLine(x+scale(xind20),y+scale(250), x+scale(xind21),y+scale(yind21));
            xind20++;
            xind21++;
            yind21++;
        }
        g.setColor(new Color(23, 218, 3));
        int yind30 = 500, xind31 = 350, yind31 = 380;
        for (int xforloop=0; xforloop<50; xforloop++){
            g.drawLine(x+scale(450),y+scale(yind30), x+scale(xind31),y+scale(yind31));
            yind30++;
            xind31++;
            yind31++;
        }
        g.setColor(new Color(0, 195, 237));
        int xind40 = 500, xind41 = 450, yind41 = 300;
        for (int xforloop=0; xforloop<30; xforloop++){
            g.drawLine(x+scale(xind40),y+scale(360), x+scale(xind41),y+scale(yind41));
            xind40++;
            xind41++;
            yind41++;
        }

        // Font and Name
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("TIMES NEW ROMAN", Font.ITALIC, scale(20)));
        g.drawString("SB KIM influenced by Piet Mondrian ", x+scale(130), y+scale(250));
    }
}
