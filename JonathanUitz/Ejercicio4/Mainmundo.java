import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Mainmundo extends Frame {
    Panel p1;
    Mimundo m;

    public Mainmundo() {

        p1 = new Panel();
        m = new Mimundo();
        p1.setLayout(new BorderLayout());
        p1.add(m, BorderLayout.CENTER);
        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
        this.setSize(500, 400);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new Mainmundo().addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent e){
          }
        });
    }

    
}
