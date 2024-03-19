import java.awt.*;
import java.awt.event.*;
public class adapt extends KeyAdapter implements MouseListener{
    adapt(){
        Frame fm = new Frame("adapter");
        fm.setSize(400,500);
        fm.setVisible(true);
        addMouseListener(this);
        Label l = new Label();
        add(l);
    }
    Label l;
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
    public void mouseExited(MouseEvent e){
        l.setText("mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Released");
    }
    public static void main(String args[]){
        new adapt();
    }
}