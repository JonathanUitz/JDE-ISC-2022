import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;


public class Main extends Frame implements MouseListener, MouseMotionListener,KeyListener {

    Panel p;
    Ejercicio4 ejercicio4;
        
    public Main(){
        p = new Panel();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        ejercicio4 = new Ejercicio4();
        p.add(ejercicio4);
        ejercicio4.addMouseListener(this);
        ejercicio4.addMouseMotionListener(this);
        this.addKeyListener(this);
        ejercicio4.addKeyListener(this);
        p.addKeyListener(this);
        this.add(p, BorderLayout.CENTER);
        this.setSize(500,400);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main().addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent e){
          }
        });
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
        System.out.println("Click");
        
        ejercicio4.setX(e.getX());
        ejercicio4.setY(e.getY());
        ejercicio4.repaint();
        
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

        ejercicio4.setX(e.getX());
        ejercicio4.setY(e.getY());
        ejercicio4.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Exit");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
       switch(e.getKeyCode()) {

        case 'a':
        case KeyEvent.VK_A:
            ejercicio4.setX(ejercicio4.getX()-1);
             break;
        case 's':
        case KeyEvent.VK_S:
            ejercicio4.setY(ejercicio4.getY()+1);
             break;
        case 'd':
        case KeyEvent.VK_D:
            ejercicio4.setX(ejercicio4.getX()+1);
             break;
        case 'w':
        case KeyEvent.VK_W:
            ejercicio4.setY(ejercicio4.getY()-1);
             break;
       }
       ejercicio4.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }


}

