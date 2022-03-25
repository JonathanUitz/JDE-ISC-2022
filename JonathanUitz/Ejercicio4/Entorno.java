import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Entorno extends Frame implements MouseListener, MouseMotionListener, KeyListener{
    Panel p1;
    Figura fig;

    public Entorno() {

        p1 = new Panel();
        fig = new Figura();
        p1.setLayout(new BorderLayout());
        p1.add(fig, BorderLayout.CENTER);
        this.addKeyListener(this);
        p1.addKeyListener(this);
        fig.addKeyListener(this);
        fig.addMouseListener(this);
        fig.addMouseMotionListener(this);
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
        new Entorno().addWindowListener(new WindowAdapter(){
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
        fig.setX(e.getX());
        fig.setY(e.getY());
        fig.repaint();
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
                fig.setX(fig.getX()-1);
                break;
            case 's':
            case KeyEvent.VK_S:
                fig.setY(fig.getY()+1);
                break;
            case 'd':
            case KeyEvent.VK_D:
                fig.setX(fig.getX()+1);
                break;
            case 'w':
            case KeyEvent.VK_W:
                fig.setY(fig.getY()-1);
                break;
        }
        fig.repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }   
}
