import java.awt.*;
import javax.swing.*;

public class BresenhamLine extends JPanel {

   

   

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bresenham's Line Drawing Algorithm");
        BresenhamLine panel = new BresenhamLine();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
