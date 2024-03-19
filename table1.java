import javax.swing.*;
public class table1 {
    table1(){
        JFrame fm = new JFrame("Table ");
        fm.setSize(500,400);
        fm.setVisible(true);
        //JPanel p1= new JPanel();
       // fm.add(p1);
        String data[][]={
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
            {"101","wintr","101"},
        };
        String column[]={"Player id ","Name","Impact%"};
        JTable jt = new JTable(data,column);
        JScrollPane sp = new JScrollPane(jt);
        jt.setBounds(30,40,200,300);
        fm.add(sp);
    }
    public static void main(String args[]){
        new table1();
    }
}