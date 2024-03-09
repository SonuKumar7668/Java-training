import java.awt.*;

public class registrationform {
    public static void main(String args[]){
        Frame fm = new Frame("REGISTRATION FORM");
        Panel p = new Panel();
        fm.setSize(400,400);
        fm.setVisible(true);
        p.setBackground(Color.YELLOW);
        fm.setBackground(Color.YELLOW);
        p.setLayout(new GridLayout(6,2));
        // fm.setLayout(new GridLayout(6,2));
        Label lb1 = new Label("Enrollment ");
        p.add(lb1);
        TextField tf1 = new TextField();
        p.add(tf1);
        tf1.setSize(8,2);
        Label lb2 = new Label("Enrollment ");
        p.add(lb2);
        TextField tf2 = new TextField();
        p.add(tf2);
        Label lb3 = new Label("Name");
        p.add(lb3);
        TextField tf3 = new TextField();
        p.add(tf3);
        Label lb4 = new Label("Branch ");
        p.add(lb4);
        TextField tf4 = new TextField();
        p.add(tf4);
        Label lb5 = new Label("Semester ");
        p.add(lb5);
        TextArea ta1 = new TextArea();
        p.add(ta1);
        Button b1 = new Button("Information ");
        p.add(b1);
        fm.add(p);
    }
}