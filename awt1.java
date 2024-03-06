import java.awt.*;
public class awt1 {
    public static void main(String args[]){
        Frame fm = new Frame("Sonu");
        awt1 ob = new awt1();
        fm.setSize(500,500);
        fm.setVisible(true);
        fm.setTitle("Sonu kumar");
        Panel p = new Panel();
        fm.add(p);
        p.setBackground(Color.red);
        Label lb1 = new Label("first Lable");
        p.add(lb1);
        Label lb2 = new Label("first Lable");
        p.add(lb2);
        Label lb3 = new Label("first Lable");
        p.add(lb3);
        Label lb4 = new Label("first Lable");
        p.add(lb4);
        Label lb5 = new Label("first Lable");
        p.add(lb5);
        Label lb6 = new Label("first Lable");
        p.add(lb6);
        Label lb7 = new Label("first Lable");
        p.add(lb7);
        Label lb8 = new Label("first Lable");
        p.add(lb8);
        Label lb9 = new Label("first Lable");
        p.add(lb9);
        Label lb10 = new Label("first Lable");
        p.add(lb10);
        TextField tf = new TextField("Enter ");
        p.add(tf);
        TextArea ta = new TextArea(45,20);
        p.add(ta);
    }
}