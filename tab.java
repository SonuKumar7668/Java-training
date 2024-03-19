import java.awt.Label;
import java.awt.TextField;

import javax.swing.*;
public class tab {
    JFrame fm;
    tab(){
        fm = new JFrame("tab");
        fm.setSize(500,400);
        fm.setVisible(true);
        JPanel p1 = new JPanel();
        fm.add(p1);
        JPanel p2 = new JPanel();
        fm.add(p2);
        JPanel p3 = new JPanel();
        fm.add(p3);
        JPanel p4 = new JPanel();
        fm.add(p4);
        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(50,50,100,100);
        tb.add("main",p1);
        tb.add("visit",p2);
        tb.add("help",p3);
        tb.add("final",p4);
        fm.add(tb);
        Label lb =new Label("name");
        p1.add(lb);
        TextField tf1 = new TextField();
        p1.add(tf1);
    }
    public static void main(String args[]){
        new tab();
    }
}