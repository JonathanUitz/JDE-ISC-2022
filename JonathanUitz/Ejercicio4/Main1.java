
import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Main1 extends Frame{

    Panel p;

    public Main1(){

        p = new Panel();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        p.add(new Mundo1());
        this.add(p, BorderLayout.CENTER);
        this.setSize(500, 400);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main1().addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });   
    }
}
