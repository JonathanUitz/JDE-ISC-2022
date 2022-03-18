package Lira;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ejercicio3 extends Canvas {

    private int x2, y2, w2, h2;
    int x, y;
    int w, h; 

    int food_x;
    int food_y;
    int food_s;

    public Ejercicio3(){
        x = 28;
        y = 50;
        w = h = 100;
        numGe();
    }
    public void paint (Graphics g){

            g.setColor(Color.BLACK);
            colision();
            g.drawRect(x, y, w, h);
            g.fillOval(x, y, w, h);
            g.setColor(Color.WHITE);
            g.drawString("Hola", x, y + h/2);    

            g.setColor(Color.BLUE);
            g.fillRect(x2,y2,20,20);
    }

    public void colision(){
        if(x >= food_x && y >= food_y &&
        (x + w) >food_x && (y + h)> food_y
        ){
            food_x = (int)(Math.random()*500);
            food_y = (int)(Math.random()*400);
        }
    }
    public void numGe() {
        int min = 60;
       int max = 300;
       Random random = new Random();
       x2  = random.nextInt(max + min) + min;
       y2 = random.nextInt(max + min) + min;
    }
    
    public int getX(){
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
    public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
}
