package Lira;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
public class Ejercicio3 extends Canvas {
    int x, y;
    int w, h; 
    public Ejercicio3(){
        x = 28;
        y = 50;
        w = h = 100;
    }
    public void paint (Graphics g){

            g.setColor(Color.BLACK);
            g.drawRect(x, y, w, h);
            g.fillOval(x, y, w, h);
            g.setColor(Color.WHITE);
            g.drawString("Hola", x, y + h/2);    

    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
