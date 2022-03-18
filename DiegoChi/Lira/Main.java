package Lira;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;


public class Main extends Frame implements MouseListener, MouseMotionListener,KeyListener {

    Panel p;
    Ejercicio3 Ejercicio3;
        
    public Main(){
        p = new Panel();
        this.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        Ejercicio3 = new Ejercicio3();
        p.add(Ejercicio3);
        Ejercicio3.addMouseListener(this);
        Ejercicio3.addMouseMotionListener(this);
        this.addKeyListener(this);
        Ejercicio3.addKeyListener(this);
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
        
        Ejercicio3.setX(e.getX());
        Ejercicio3.setY(e.getY());
        Ejercicio3.repaint();
        
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

        Ejercicio3.setX(e.getX());
        Ejercicio3.setY(e.getY());
        Ejercicio3.repaint();
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
            Ejercicio3.setX(Ejercicio3.getX()-1);
             break;
        case 's':
        case KeyEvent.VK_S:
            Ejercicio3.setY(Ejercicio3.getY()+1);
             break;
        case 'd':
        case KeyEvent.VK_D:
            Ejercicio3.setX(Ejercicio3.getX()+1);
             break;
        case 'w':
        case KeyEvent.VK_W:
            Ejercicio3.setY(Ejercicio3.getY()-1);
             break;
       }
       Ejercicio3.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }


}

