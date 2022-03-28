import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Pmain extends Frame implements MouseListener, MouseMotionListener, KeyListener{

    Panel p1;
    Pacman pacman;

    public Pmain(){

        p1 = new Panel();
        pacman = new Pacman();
        p1.setLayout(new BorderLayout());
        p1.add(pacman, BorderLayout.CENTER);
        this.addKeyListener(this);
        p1.addKeyListener(this);
        pacman.addKeyListener(this);
        pacman.addMouseListener(this);
        pacman.addMouseMotionListener(this);
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
        new Pmain().addWindowListener(new WindowAdapter(){
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
        System.out.println("Clicked");
        pacman.setX(e.getX());
        pacman.setY(e.getY());
        pacman.repaint();
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

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyCode()){
            case 'a':
            case KeyEvent.VK_A:
                pacman.setX(pacman.getX()-1);
                break;
            case 's':
            case KeyEvent.VK_S:
                pacman.setY(pacman.getY()+1);
                break;
            case 'd':
            case KeyEvent.VK_D:
                pacman.setX(pacman.getX()+1);
                break;
            case 'w':
            case KeyEvent.VK_W:
                pacman.setY(pacman.getY()-1);
                break;
        }
        pacman.setSprite();
        pacman.repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
