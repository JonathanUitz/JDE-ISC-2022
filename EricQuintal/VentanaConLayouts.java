package EricQuintal;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaConLayouts extends Frame implements ActionListener {
	//Widegs
	Button btn,btn1, btn2;
	Button btns[];
	Panel pn1, pn2, pn3, pn4;
	TextArea txt;
	
	//Constructor 
	public VentanaConLayouts() {
		btns= new Button[10];
		for (int i=0; i<btns.length; i++){
            btns[i] = new Button(i + " ");
            btns[i].addActionListener(this);
        }
		
		
		//Instanciar mis botones
		btn= new  Button("Cerrar");
		btn1= new Button("8");
		btn2= new Button("6");
		
		//Instanciar mis paneles
		pn1= new Panel();
		pn2= new Panel();
		pn3= new Panel();
		pn4= new Panel();
		//Instanciar mi textArea
		txt= new TextArea();
		
		//Dar formato
		//5 formas de usar los bordes layout
		//BorderLayour separa por pedazos
		this.setLayout(new BorderLayout());
		
			//Grind realiza una maya, como excel, conformado por celdas, pinta los botones de arriba
			pn1.setLayout(new GridLayout(3,2));
			for (int i=0; i<6;i++){
	            pn1.add(btns[i]); 
	        }
			
			//Sigue un esquema de flujos, pinta los botones de abajo
			pn2.setLayout(new FlowLayout());
			for (int i=6; i<btns.length;i++){
	            pn2.add(btns[i]);
	        }
			
			//Para trabajar con un unico widges
			pn3.setLayout(new CardLayout());
			pn3.add(btns[9]);
			
			

		    this.add(pn1, BorderLayout.NORTH);
		    this.add(pn2, BorderLayout.SOUTH);
		    this.add(pn3, BorderLayout.CENTER);
		    this.add(btn, BorderLayout.WEST);
		    this.add(pn4, BorderLayout.EAST);
		       
		    pn4.setLayout(null);
		    btn2.setBounds(5,5, 20, 20); //Null

		    pn4.setSize(200,100);
		    pn4.add(btn1);
		    pn4.add(btn2);
		    pn4.setVisible(true);
		        
		    this.setSize(400,300);
		    this.setVisible(true);
		    
		    //Llamar
		    btn.addActionListener(this);
		    btn1.addActionListener(this);
		    btn2.addActionListener(this); 
		    //cerrarVentana();
	}

	public static void main (String args[]) {
		 VentanaConLayouts ven= new  VentanaConLayouts();
	}
	public void cerrarVentana() {
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn) 
	        System.exit(0);
		
	   
	}

}
