
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Mundo extends Canvas{

    int x, y;
    int w, h;

    int food_x;
    int food_y;
    int food_s;

    int sprite;

    public Mundo(){
        sprite = 1;
        x=20;
        y=28;
        w = h = 100;

        food_x = (int)(Math.random()*500);
        food_y = (int)(Math.random()*400);
        food_s = 20;
    }

    public void paint(Graphics g){

        colision();

        g.setColor(Color.YELLOW);
        g.fillOval(food_x, food_y, food_s, food_s);
        g.setColor(Color.BLACK);
        //g.drawRect(x, y, w, h);
        switch (sprite) {
            case 1:
                g.fillOval(x, y, w, h);
                break;
            
            case 2:
                g.fillArc(x, y, w, h, 0, 270);
                break;

            case 3:
                g.fillArc(x, y, w, h, 0, 200);
                break;
    
        }
        //g.fillOval(x, y, w, h);
        g.setColor(Color.WHITE);
        g.drawString("Hola mundo", x, (y+h/2));

    }

    public void colision(){
        /**
         * La posicion "x" de la principal es mayor que la posicion de la secundaria
         * La posicion "x" de la principal es menor que la posicion de la secundria mas 
         * La posicion de "y" de la principal es mayor que la posicion de y de la secuncaria
         * La posicion de "y" de la principal es menor que la posicion de la secundaria mas 
         */
        if(food_x > x && 
           food_x < (x+w) &&
           food_y > y &&
           food_y < (y+h)
        ){
                food_x = (int)(Math.random()*500);
                food_y = (int)(Math.random()*400);
        }
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

    public void setSprite(){
        sprite++;
        if(sprite>3){
            sprite=1;
        }
    }
    
}
