import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Figura extends Canvas{
    
    int x, y;
    int w, h;

    public Figura(){
        x=20;
        y=28;
        w = h = 100;
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, w, h);
        g.fillOval(x, y, w, h);
        g.setColor(Color.WHITE);
        g.drawString("Hola mundo", x, (y+h/2));   
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
    
}
