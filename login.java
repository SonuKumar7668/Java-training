import java.awt.*;

public class login {
    public static void main(String args[]){
        Frame fm = new Frame("LOGIN FORM");
        Panel p = new Panel();
        fm.setSize(400,300);
        fm.setVisible(true);
        p.setBackground(Color.BLUE);
        // fm.setBackground(Color.BLUE);
        p.setLayout(new GridLayout(3,2));
        // fm.setLayout(new GridLayout(3,2));
        Label lb1 = new Label("User Name ");
        p.add(lb1);
        TextField tf1 = new TextField();
        p.add(tf1);
        Label lb2 = new Label("User Name ");
        p.add(lb2);
        TextField tf2 = new TextField();
        p.add(tf2);
        Button b1 = new Button("LOG IN");
        p.add(b1);
        fm.add(p);
    }
}