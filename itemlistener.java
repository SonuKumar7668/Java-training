import java.awt.*;
import java.awt.event.*;
public class itemlistener{
    itemlistener(){
        Frame fm = new Frame("tick box.");
        fm.setVisible(true);
        fm.setSize(400,300);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.PINK);
        p3.setBackground(Color.RED);
        fm.add(p1);
        fm.add(p2);
        fm.add(p3);
        Label radiores = new Label("Radio Output");
        CheckboxGroup grp = new CheckboxGroup();
        Checkbox c1 = new Checkbox("male",grp,false);
        c1.addItemListener(null);
        Checkbox c2 = new Checkbox("female",grp,false);
        c1.addItemListener(null);
        Button b1 = new Button("Submit");
        fm.add(b1);
        // Checkbox c3 = new Checkbox();
    }
    public static void main(String args[]){
        itemlistener ob = new itemlistener();
    }
}