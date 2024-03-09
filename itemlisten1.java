import java.awt.event.*;

public class itemlisten1 {
    public void actionPerformed(ActionEvent act){
        if(act.getSource()==b1){
            System.exit(0);
        }
    }
    public void itemStateCharged(ItemEvent it){
        if(it.getSource()==ch)
        ch_res.setText(ch.getSelectedItem());
        if(it.getsource()==lst)
        ch_res.setText(ch.getSelectedItem());
        if(it.getsource()==c1)
        ch_res.setText(ch.getSelectedItem());
        if(it.getsource()==c2)
        ch_res.setText(ch.getSelectedItem());
    }
    public static void main(String args[]){
        itemlisten1 ob = new itemlisten1();
        // ob.itemStateCharged();
    }
    
}