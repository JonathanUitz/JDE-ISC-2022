package JonathanUitz.Ejercicio4;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{

    Panel p;

    public Main(){

        p = new Panel();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        p.add(new Mundo());
        this.add(p, BorderLayout.CENTER);
        this.setSize(500, 400);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main().addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });   
    }
}
