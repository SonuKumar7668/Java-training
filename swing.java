import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class swing {
    swing(){
        // addMouseListener(this);
        JFrame fm = new JFrame("Swing");
        fm.setSize(500,400);
        fm.setVisible(true);
        JPanel p = new JPanel();
        fm.add(p);
        // p.setLayout(new GridLayout(6,2));
        ImageIcon i1 = new ImageIcon("C:\\Users\\sonu kumar\\OneDrive\\Desktop\\342054.png");
        JLabel lb1 = new JLabel(i1);
        p.add(lb1);
    }
    public static void main(String args[]){
        new swing();
    }
}