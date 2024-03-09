import java.awt.*;
public class guiapp {
    public static void main(String args[]){
        Frame fm = new Frame("AWT GUI APPLICATION");
        Panel p = new Panel();
        fm.setSize(300,400);
        fm.setVisible(true);
        p.setBackground(Color.PINK);
        fm.setBackground(Color.BLUE);
        p.setLayout(new GridLayout(6,2));
        fm.setLayout(new GridLayout(6,2));
        Label le1 = new Label("Enter first Number");
        p.add(le1);
        TextField tf1 = new TextField();
        p.add(tf1);
        Label le2 = new Label("Enter Second Number");
        p.add(le2);
        TextField tf2 = new TextField();
        p.add(tf2);
        Label le3 = new Label("Enter Third Number");
        p.add(le3);
        TextField tf3 = new TextField();
        p.add(tf3);
        Label leb1 = new Label("#### AVERAGE ####");
        p.add(leb1);
        Label leb2 = new Label("Display the Risult here");
        p.add(leb2);
        Button bt1 = new Button("Compute");
        p.add(bt1);
        Button bt2= new Button("Refresh");
        p.add(bt2);
        Button bt3 = new Button("Exit");
        p.add(bt3);
        fm.add(p);
    }
}