import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;
import java.awt.event.*;

public class Main2 extends Frame implements MouseListener, MouseMotionListener, KeyListener{

    Panel p;
    Mundo2 mundo2;

    public Main2(){

        p = new Panel();
        mundo2 = new Mundo2();
        p.setLayout(new BorderLayout());
        p.add(mundo2, BorderLayout.CENTER);
        this.addKeyListener(this);
        p.addKeyListener(this);
        mundo2.addKeyListener(this);
        mundo2.addMouseListener(this);
        mundo2.addMouseMotionListener(this);
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
        Mundo2 canvasP = new Mundo2();
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
        mundo2.setX(e.getX());
        mundo2.setY(e.getY());
        mundo2.repaint();
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
                mundo2.setX(mundo2.getX()-1);
                break;
            case 's':
            case KeyEvent.VK_S:
                mundo2.setY(mundo2.getY()+1);
                break;
            case 'd':
            case KeyEvent.VK_D:
                mundo2.setX(mundo2.getX()+1);
                break;
            case 'w':
            case KeyEvent.VK_W:
                mundo2.setY(mundo2.getY()-1);
                break;
        }
        mundo2.setSprite();
        mundo2.repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
