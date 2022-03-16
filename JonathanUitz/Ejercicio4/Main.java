package JonathanUitz.Ejercicio4;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements MouseListener, MouseMotionListener{

    Panel p;
    Mundo mundo;

    public Main(){

        p = new Panel();
        mundo = new Mundo();
        p.setLayout(new BorderLayout());
        p.add(mundo, BorderLayout.CENTER);
        mundo.addMouseListener(this);
        mundo.addMouseMotionListener(this);
        this.setLayout(new BorderLayout());
        this.add(p, BorderLayout.CENTER);
        this.setSize(500, 400);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Main canvasI = new Main();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Moved");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Clicked");
        mundo.setX(e.getX());
        mundo.setY(e.getY());
        mundo.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Exited");
    }
}
