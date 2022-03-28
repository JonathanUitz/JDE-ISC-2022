import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class FiguraM extends Frame implements MouseListener, MouseMotionListener, KeyListener{

    Panel p1;
    figura1 fig1;

    public FiguraM(){

        p1 = new Panel();
        fig1 = new figura1();
        p1.setLayout(new BorderLayout());
        p1.add(fig1, BorderLayout.CENTER);
        this.addKeyListener(this);
        p1.addKeyListener(this);
        fig1.addKeyListener(this);
        fig1.addMouseListener(this);
        fig1.addMouseMotionListener(this);
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
        new FiguraM().addWindowListener(new WindowAdapter(){
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
        fig1.setX(e.getX());
        fig1.setY(e.getY());
        fig1.repaint();
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
                fig1.setX(fig1.getX()-1);
                break;
            case 's':
            case KeyEvent.VK_S:
                fig1.setY(fig1.getY()+1);
                break;
            case 'd':
            case KeyEvent.VK_D:
                fig1.setX(fig1.getX()+1);
                break;
            case 'w':
            case KeyEvent.VK_W:
                fig1.setY(fig1.getY()-1);
                break;
        }
        fig1.repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
