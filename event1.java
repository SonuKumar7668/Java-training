import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
public class event1 extends Frame implements ActionListener {
    event1(){
        Frame fm = new Frame("Event Listener");
        Panel p = new Panel();
        fm.add(p);
        fm.setVisible(true);
        fm.setSize(400,600);
        p.setLayout(new GridLayout (4,2));
        Label lb1 = new Label("Name ");
        p.add(lb1);
        TextField tf1 = new TextField();
        p.add(tf1);
        Label lb2 = new Label("Branch ");
        p.add(lb2);
        TextField tf2 = new TextField();
        p.add(tf2);
        Label lb3 = new Label("Semester ");
        p.add(lb3);
        TextField tf3 = new TextField();
        p.add(tf3);
        TextArea ta = new TextArea(1,1);
        p.add(ta);
        Button b1 = new Button("submit");
        p.add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent act){
        if(act.getSource() == b1){
            String name= tf1.getText();
            String branch = tf2.getText();
            String semester = tf3.getText();
            String strout = "Entered details are:  \n";
            strout += "Name "+name+"\n";
            strout += "Branch "+branch+"\n";
            strout += "Semester "+semester+"\n";
            ta.setText(strout);
            
        }
    }
    public static void main(String args[]){
        event1 ob = new event1();
    }
}