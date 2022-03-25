package Eje;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;


public class Ejercicio2 extends Frame implements ActionListener{
    Button btn;
    Button btns[];
    Button btn1;
    Button btn2;
    Panel p1;
    Panel p2;
    Panel p3;
    Panel p4;
    TextArea txt;

    public Ejercicio2(){
        btn = new Button("CERRAR");
        btn1= new Button("8");
		btn2= new Button("6");
        btns = new Button[10];
        for (int i=0; i<btns.length; i++){
            btns[i] = new Button(i + "");
            btns[i].addActionListener(this);
        }
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        txt = new TextArea();
        this.setLayout(new BorderLayout());

        p1.setLayout(new GridLayout(3,2));
        for(int i=6 ; i<btns.length; i++){
            p1.add(btns[i]);
        }

        p2.setLayout(new FlowLayout());
        for(int i=6; i<btns.length; i++){
            p2.add(btns[i]);
        }

        p3.setLayout(new CardLayout());
        p3.add(btns[9]);

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.CENTER);
        this.add(btn, BorderLayout.WEST);
        this.add(p4, BorderLayout.EAST);
        btn1.setBounds(5,5,20,20);
        p4.add(btn1);
        p4.add(btn2);
        p4.setSize(800,300);
        p4.setVisible(true);
        this.setSize(400, 300);
        this.setVisible(true);

        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
    }

    public static void main(String args[]){
        Ejercicio2 c = new Ejercicio2();
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btn) System.exit(0);
        else{
            System.out.println(e.getActionCommand());
        }
    }


}
